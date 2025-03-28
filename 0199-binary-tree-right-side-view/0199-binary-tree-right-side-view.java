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
        Queue<TreeNode>qq=new LinkedList<>();
        if(root==null)return l;
        qq.offer(root);
        while(!qq.isEmpty()){
            int s=qq.size();
            for(int i=0;i<s;i++){
                TreeNode z=qq.poll();
                if(z.left!=null){
                    qq.offer(z.left);
                }
                if(z.right!=null){
                    qq.offer(z.right);
                }
                if(i==s-1){
                    l.add(z.val);
                }
            }
        }
        return l;
        
    }
}