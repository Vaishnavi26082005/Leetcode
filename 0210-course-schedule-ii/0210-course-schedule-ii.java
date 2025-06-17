class Solution {
    public int[] findOrder(int V, int[][] course) {
        int in[]= new int[V];
        List<List<Integer>> l= new ArrayList<>();
        for(int i=0;i<V;i++){
            l.add(new ArrayList<>());
        }

        for(int [] a:course){
            int u=a[0];
            int v=a[1];
            l.get(u).add(v);
           
        }
        for(int i=0;i<l.size();i++){
            for(int a:l.get(i)){
                in[a]++;

            }
        }
        Queue<Integer>qq= new LinkedList<>();
        for(int i=0;i<V;i++){
            if(in[i]==0){
                qq.add(i);
            }
        }
        List<Integer>res=new ArrayList<>();
        while(!qq.isEmpty()){
            int node=qq.poll();
            res.add(node);
            for(int z:l.get(node)){
                in[z]--;
                if(in[z]==0)qq.add(z);
            }

        }
        if(res.size()!=V)return new int[]{};
        int result[]=new int[V];
        int j=0;
        for(int i=V-1;i>=0;i--){
            result[j]=res.get(i);
            j++;
        }
        return result;
    }
}
    