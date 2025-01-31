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
    int nodeIdx=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder==null){
            return null;
        }
    nodeIdx=0;
    return help(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public TreeNode help(int[]preorder,int start,int end){
        if(nodeIdx==preorder.length||preorder[nodeIdx]<start||preorder[nodeIdx]>end)return null;
        int val=preorder[nodeIdx++];
        TreeNode node=new TreeNode(val);
        node.left=help(preorder,start,val);
        node.right=help(preorder,val,end);
        return node;
    }
}