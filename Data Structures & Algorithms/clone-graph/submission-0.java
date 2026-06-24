/*
Definition for a Node.
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
    public Node cloneGraph(Node node) {
        HashMap<Node,Node> news = new HashMap<>();
        return dfs(node, news);
    }

    public Node dfs(Node node, HashMap<Node,Node> news){
        if (node == null){
            return null;
        }
        if (news.containsKey(node)){
            return news.get(node);
        }
        Node copy = new Node(node.val);
        news.put(node, copy);

        for (Node i: node.neighbors){
            copy.neighbors.add(dfs(i, news));
        }
        return copy;

    }
}