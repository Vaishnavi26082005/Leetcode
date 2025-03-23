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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return create(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode create(int[]preorder,int plo,int phi,int[]inorder,int ilo,int ihi){
        if(ilo>ihi||plo>phi){
            return null;
        }
        TreeNode nn=new TreeNode(preorder[plo]);
        int i =find(preorder[plo],ilo,ihi,inorder);
        int nel=i-ilo;
        nn.left=create(preorder,plo+1,plo+nel,inorder,ilo,i-1);
        nn.right=create(preorder,plo+nel+1,phi,inorder,i+1,ihi);
        return nn;
    }
    public int find(int t,int si,int hi,int[]inorder){
      for(int i=si;i<=hi;i++){
        if(inorder[i]==t)return i;
      }
       return -1;
    }
}