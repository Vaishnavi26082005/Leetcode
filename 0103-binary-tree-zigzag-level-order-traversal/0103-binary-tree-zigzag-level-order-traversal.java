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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans= new LinkedList<>();

        if(root==null){
            return ans;
        }
        Queue<TreeNode >qq= new LinkedList<>();
        qq.offer(root);
       int level=0;
        while(!qq.isEmpty()){
            int s=qq.size();
         List<Integer>l= new LinkedList<>();
            while(s>0){
             TreeNode r=qq.poll();

               if(level%2!=0){
                l.addFirst(r.val);
               }
               else{
                l.add(r.val);
               }
               if(r.left!=null){
                qq.add(r.left);
               }
               if(r.right!=null){
                qq.add(r.right);
               }
              s--;
            }
            level++;
            ans.add(l);
        }
        return ans;
    }
}