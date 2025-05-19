class Solution {
    public int minMutation(String start, String end, String[] bank) {
        HashSet<String>set= new HashSet<>(Arrays.asList(bank));
        if(!set.contains(end))return -1;
        HashSet<String>visi=new HashSet<>();
        Queue<String>qq= new LinkedList<>();
        qq.offer(start);
        int level=0;
        while(!qq.isEmpty()){
            int  n=qq.size();
            while(n-->0){
            String curr= qq.poll();
            if(curr.equals(end))return level;
            for(char ch:new char[]{'A','C','G','T'}){
                for(int i=0;i<curr.length();i++){
                    char k[]=curr.toCharArray();
                    k[i]=ch;
                    String nbr=new String(k);
                    if(!visi.contains(nbr)&&set.contains(nbr)){
                        visi.add(nbr);
                        qq.add(nbr);
                    }
                }
            }
            }
            level++;
        }
return -1;
    }
}