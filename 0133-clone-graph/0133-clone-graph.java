/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    private Map<Node,Node> visi=new HashMap<>();

    public Node cloneGraph(Node node) {
        if(node==null)return null;
        if(visi.containsKey(node)){
            return visi.get(node);
        }
        Node newNode= new Node(node.val);
        visi.put(node,newNode);
        for(Node n:node.neighbors){
            newNode.neighbors.add(cloneGraph(n));
        }
   return newNode;
    }
}