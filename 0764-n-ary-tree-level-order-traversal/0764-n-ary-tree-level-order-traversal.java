/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>>ans= new ArrayList<>();
        if (root == null) return ans;
       Queue<Node > qq= new LinkedList<>();
       qq.add(root);
       while(!qq.isEmpty()){
        int n=qq.size();
        List<Integer>l= new ArrayList<>();
        while(n-->0){
        Node r=qq.poll();
            l.add(r.val);
        for(Node k:r.children){
            qq.add(k);
        }
        }
        ans.add(l);
       }
return ans;
    };
}