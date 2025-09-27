class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        cs(n,1,k,l,res);
        return res;
    }
    public static void cs(int n,int idx,int k,  List<Integer> l, List<List<Integer>> res){
        if(l.size()==k){
            res.add(new ArrayList<>(l));
        }

        for(int i=idx;i<=n;i++){
            l.add(i);
            cs(n,i+1,k,l,res);
            l.remove(l.size()-1);
        }

    }
}