class Solution {
    public boolean canFinish(int V, int[][] ar) {
        List<List<Integer>> arr = new ArrayList<>();

        int []in =new int[V];
        for(int i=0;i<V;i++){
         arr.add(new ArrayList<>());
        }
        for(int[] a:ar){
            int u=a[0];
            int v=a[1];
            arr.get(u).add(v);
            in[v]++;
        }
        LinkedList<Integer>qq= new LinkedList<>();
        for(int i=0;i<V;i++){
            if(in[i]==0){
                qq.add(i);
            }
        }
        List<Integer>l= new ArrayList<>();
        while(!qq.isEmpty()){
            int r=qq.poll();
            l.add(r);
            for(int k:arr.get(r)){
                in[k]--;
                if(in[k]==0)qq.add(k);
            }
        }
        return l.size()==V;
    }
}