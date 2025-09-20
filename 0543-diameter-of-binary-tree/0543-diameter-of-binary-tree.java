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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
         int ld=diameterOfBinaryTree(root.left);
         int rd=diameterOfBinaryTree(root.right);
         int sd=ht(root.left)+ht(root.right);
         return Math.max(sd,(Math.max(ld,rd)));
    }
private static int ht(TreeNode root){
    if(root==null)return 0;
    int lh=ht(root.left);
    int rh=ht(root.right);
    return Math.max(lh,rh)+1;
}

}