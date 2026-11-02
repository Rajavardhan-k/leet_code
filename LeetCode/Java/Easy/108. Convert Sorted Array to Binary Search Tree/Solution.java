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
    TreeNode bst(int l,int nums[],int r){
        if(l>r) return null;
        int mid=l+(r-l)/2;
        TreeNode temp=new TreeNode(nums[mid]);
        temp.left=bst(l,nums,mid-1);
        temp.right=bst(mid+1,nums,r);
        return temp;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(0,nums,nums.length-1);
    }
}