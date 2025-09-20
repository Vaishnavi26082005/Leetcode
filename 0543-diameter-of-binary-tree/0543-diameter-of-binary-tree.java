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
 public class DiaPair{
    int d=0;
    int ht=-1;
 }
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return dia(root).d;
    }
private static DiaPair dia(TreeNode root){
    if(root==null)return new DiaPair();
    DiaPair left= dia(root.left);
    DiaPair right=dia(root.right);
    DiaPair sdp= new DiaPair();
    sdp.ht=Math.max(left.ht,right.ht)+1;
    int dia=left.ht+right.ht+2;
    sdp.d=Math.max(dia, Math.max(left.d, right.d));
    return sdp;

}

}