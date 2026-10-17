/*
Definition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    void count(Node root,List<Integer> al){
        if(root==null) return;
        count(root.left,al);
        al.add(root.data);
        count(root.right,al);
    }
    public int getSize(Node root) {
        if(root==null){
            return 0;
        }
        ArrayList<Integer> al=new ArrayList<>();
        count(root,al);
        return al.size();
        
    }
}