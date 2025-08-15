class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] adjacencyList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjacencyList[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjacencyList[u].add(v);
            adjacencyList[v].add(u); 
        }

        boolean[] visited = new boolean[n];
        List<List<Integer>> components = new ArrayList<>();

        for (int v = 0; v < n; v++) {
            if (!visited[v]) {
                List<Integer> component = new ArrayList<>();
                bfs(v, visited, component, adjacencyList);
                components.add(component);
            }
        }

        int completeCount = 0;
        for (List<Integer> component : components) {
            if (isCompleteComponent(component, adjacencyList)) {
                completeCount++;
            }
        }

        return completeCount;
    }

    private void bfs(int start, boolean[] visited, List<Integer> component, List<Integer>[] adjacencyList) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            component.add(vertex);

            for (int neighbor : adjacencyList[vertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        
    }
     private boolean isCompleteComponent(List<Integer> component, List<Integer>[] adjacencyList) {
        int size = component.size();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (!adjacencyList[component.get(i)].contains(component.get(j))) {
                    return false;
                }
            }
        }
        return true;
    }
}