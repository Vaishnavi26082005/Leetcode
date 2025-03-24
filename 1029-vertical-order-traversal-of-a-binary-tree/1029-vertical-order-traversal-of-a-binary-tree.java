/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root==null){
            return res;
        }
        TreeMap<Integer,TreeMap<Integer,List<Integer>>>map=new TreeMap<>();
        dfs(root,0,0,map);
        for(int key:map.keySet()){
            List<Integer>l= new ArrayList<>();
            for(int z:map.get(key).keySet()){
              List<Integer> n = map.get(key).get(z);
                Collections.sort(n);
                l.addAll(n);
            }
            res.add(l);
        }
        return res;
    }
    public void dfs(TreeNode root,int col,int level,TreeMap<Integer,TreeMap<Integer,List<Integer>>>map){
        if(root==null){
            return;
        }
        if(!map.containsKey(col)){
            map.put(col,new TreeMap<>());

        }
        if(!map.get(col).containsKey(level)){
            map.get(col).put(level,new ArrayList<>());
        }
        map.get(col).get(level).add(root.val);
        if(root.left!=null){
            dfs(root.left,col-1,level+1,map);
        }
        if(root.right!=null){
            dfs(root.right,col+1,level+1,map);
        }
    }
}