/* Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
} */

class Solution {
    static int sum=0;
    static void pre(Node root){
        if(root==null) return;
        sum+=root.data;
        pre(root.left);
        pre(root.right);
    }
    static int sumBT(Node root) {
        // code here
        sum=0;
        pre(root);
        return sum;
    }
}