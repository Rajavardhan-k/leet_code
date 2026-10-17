/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    void pre(Node root,List<Integer> al){
        if(root==null) return;
        al.add(root.data);
        pre(root.left,al);
        pre(root.right,al);
    }
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> al=new ArrayList<>();
        pre(root,al);
        return al;
    }
}