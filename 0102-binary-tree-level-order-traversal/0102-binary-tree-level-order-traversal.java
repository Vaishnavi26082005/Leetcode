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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans= new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode>qq= new LinkedList<>();
        qq.offer(root);
        while(!qq.isEmpty()){
            List<Integer>l= new ArrayList<>();
            int s=qq.size();
            while(s!=0){
            TreeNode r=qq.poll();
            l.add(r.val);
            if(r.left!=null){
                qq.add(r.left);
            }
            if(r.right!=null){
                qq.add(r.right);
            }
         s--;
            }
            ans.add(l);


        }
        return ans;
    }
}