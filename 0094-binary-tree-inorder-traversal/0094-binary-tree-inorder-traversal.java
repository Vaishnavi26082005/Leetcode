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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>l= new ArrayList<>();
        if(root==null)return l;
        Stack<TreeNode>s= new Stack<>();
        // List<Integer>l= new ArrayList<>();
        TreeNode r=root;
        while(r !=null||!s.isEmpty()){
            while(r!=null){
                s.push(r);
                r=r.left;
            }
           TreeNode k=s.pop();
            l.add(k.val);
            r=k.right;
            
        } 
        return l;
    }
}