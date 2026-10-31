class Solution {
    int fun(int nums[],int idx){
        if(idx>=nums.length) return 0;
        if(memo[idx]!=-1) return memo[idx];
        return nums[idx]+Math.max(fun(nums,idx+2),fun(nums,idx+3));
    }
    public int rob(int[] nums) {
        return Math.max(fun(nums,0),fun(nums,1));
    }
}