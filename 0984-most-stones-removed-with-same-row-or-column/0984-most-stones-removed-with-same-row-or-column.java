class Solution {
    public void dfs(List<List<Integer>>l,int src,HashSet<Integer>v){
        v.add(src);
        for(int nbr:l.get(src)){
            if(!v.contains(nbr))
            dfs(l,nbr,v);
        }
    }
    public int removeStones(int[][] stone) {
        List<List<Integer>>l= new ArrayList<>();
        int n=stone.length;
        int m=stone[0].length;
        for(int i=0;i<n;i++){
           l.add(new ArrayList<>()); 
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(stone[i][0]==stone[j][0]||stone[i][1]==stone[j][1]){
                    l.get(i).add(j);
                    l.get(j).add(i);
                }

            }
        }
        int c=0;
        HashSet<Integer>v= new HashSet<>();
        for(int i=0;i<n;i++){
            if(!v.contains(i)){
                dfs(l,i,v);c++;
            }
        }
return n-c;
    }
}