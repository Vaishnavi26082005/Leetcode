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
    boolean findTarget(TreeNode root, int target) {
       HashSet<Integer>set = new HashSet<>();
       return dfs(set,root,target);
    }
    public static boolean dfs(HashSet<Integer>set,TreeNode root,int k){
        if(root==null){
            return false;
        }
        if(set.contains(k-root.val))return true;
        set.add(root.val);
        
        return dfs(set,root.left,k)||dfs(set,root.right,k);
    }
    
}