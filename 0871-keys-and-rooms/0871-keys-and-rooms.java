class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visi= new boolean [n];
        dfs(rooms,0,visi);
        for(boolean v:visi){
            if(!v)return false;
        }
        return true;
    }
    public void dfs(List<List<Integer>>room,int u,boolean[] visi){
        visi[u]=true;
        for(int v:room.get(u)){
            if(!visi[v]){
                dfs(room,v,visi);
            }
        }
    }
}