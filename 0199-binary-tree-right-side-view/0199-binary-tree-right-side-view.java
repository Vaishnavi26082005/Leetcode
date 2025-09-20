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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>l= new ArrayList<>();
        if(root==null)return l;
        Queue<TreeNode> qq= new LinkedList<>();
        qq.add(root);
        while(!qq.isEmpty()){
            int s=qq.size();
            for(int i=0;i<s;i++){
                TreeNode r=qq.poll();
                if(i==s-1)l.add(r.val);
                if(r.left!=null)qq.add(r.left);
                if(r.right!=null)qq.add(r.right);
            }
        }
        return l;
    }
}