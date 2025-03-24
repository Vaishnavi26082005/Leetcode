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
 public class BalancedPair{
    int ht=-1;
    boolean isbal=true;
 }
class Solution {
    public boolean isBalanced(TreeNode root) {
       return is(root).isbal; 
    }
    public BalancedPair is(TreeNode root){
        if(root==null){
            return new BalancedPair();
        }
        BalancedPair left=is(root.left);
        BalancedPair right=is(root.right);
        BalancedPair sp=new BalancedPair();
        sp.ht=Math.max(left.ht,right.ht)+1;
        int bf=Math.abs(right.ht-left.ht);
        sp.isbal=left.isbal&&right.isbal&&bf<=1;
      return sp;
    }
}