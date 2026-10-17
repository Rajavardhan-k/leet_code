/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    void post(Node root,List<Integer> al){
        if(root==null) return;
        post(root.left,al);
        post(root.right,al);
        al.add(root.data);
    }
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> al=new ArrayList<>();
        post(root,al);
        return al;
    }
}