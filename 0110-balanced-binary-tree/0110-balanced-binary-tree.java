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
 public class Bal{
    int ht=-1;
    boolean isbal=true;
 }
class Solution {
    public boolean isBalanced(TreeNode root) {
      return  isball(root).isbal;
    }
    public Bal isball(TreeNode root){
        if(root==null)return new Bal();
        Bal l=isball(root.left);
        Bal r= isball(root.right);
        Bal s=new Bal();
        s.ht=Math.max(l.ht,r.ht)+1;
        int b=Math.abs(l.ht-r.ht);
        s.isbal=l.isbal&&r.isbal&&b<=1;
return s;
    }
}