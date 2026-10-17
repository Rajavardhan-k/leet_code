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
    void mpre(TreeNode root,List<Integer> al1){
        if(root==null){
            al1.add(-101);
            return;
        }
        al1.add(root.val);
        mpre(root.right,al1);
        mpre(root.left,al1);
    }
    void pre(TreeNode root,List<Integer> al2){
        if(root==null){
            al2.add(-101);
            return;
        }
        al2.add(root.val);
        pre(root.left,al2);
        pre(root.right,al2);
    }
    public boolean isSymmetric(TreeNode root) {
        List<Integer> al1=new ArrayList<>();
        List<Integer> al2=new ArrayList<>();
        mpre(root,al1);
        pre(root,al2);
        for(int i=0;i<al1.size();i++){
            if(al1.get(i)!=al2.get(i)) return false;
        }
        return true;
    }
}