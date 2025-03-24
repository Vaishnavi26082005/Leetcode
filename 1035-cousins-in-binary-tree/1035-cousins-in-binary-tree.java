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
    public boolean isCousins(TreeNode root, int x, int y) {
      if(root==null){
        return false;
      } 
      Queue<TreeNode>q= new LinkedList<>();
        q.add(root);
        
        
        while(!q.isEmpty()){
            int size=q.size();
            //check same level
            int childCount=0;

            for(int i=0;i<size;i++){
                TreeNode node= q.poll();
                int sameParentCount=0;
                if(node.left!=null){
                  if(node.left.val==x||node.left.val==y){
                    sameParentCount++;
                    childCount++;
                  } 
                  q.offer(node.left);   
                }

                if(node.right!=null){
                  if(node.right.val==x||node.right.val==y){
                    sameParentCount++;
                    childCount++;
                  } 
                  q.offer(node.right);   
                }
                if(sameParentCount==2){
                   return false;
                }
            }
                if (childCount == 2){
                    return true;
                }
                if(childCount ==1){
                    return false;
                }
            }
     
        
        return false;
    }
}