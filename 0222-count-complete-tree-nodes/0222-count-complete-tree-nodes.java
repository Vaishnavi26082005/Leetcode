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
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
     int ans=count(root);
    return ans+1;
    }
    
    public int  count(TreeNode root){
        if(root==null)return 0;
        int lh=0;
        if(root.left!=null)lh= 1+count(root.left);
        int rh=0;
        if(root.right!=null)rh=1+count(root.right);
        return lh+rh;

    }
}