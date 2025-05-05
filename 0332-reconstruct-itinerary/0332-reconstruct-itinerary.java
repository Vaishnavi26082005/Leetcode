class Solution {
    HashMap<String,PriorityQueue<String>>gp;
    LinkedList<String> qq= new LinkedList<>();                                        

    public List<String> findItinerary(List<List<String>> tickets) {
      gp= new HashMap<>();
      qq= new LinkedList<>();  

      for(List<String>t:tickets){
        PriorityQueue<String> temp= gp.getOrDefault(t.get(0),new PriorityQueue<>());
        temp.add(t.get(1));
        gp.put(t.get(0),temp);
      }
        dfs("JFK");
      return qq;
    }
    public void dfs(String src){
        PriorityQueue<String>nbr=gp.get(src);
    while (nbr != null&&nbr.size()>0){
            String nr=nbr.remove();
            dfs(nr);
        }
        qq.addFirst(src);
    }
    
}