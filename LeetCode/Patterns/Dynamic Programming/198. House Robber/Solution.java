class Solution {
    int fun(int nums[],int idx){
        if(idx>=nums.length) return 0;
        return nums[idx]+Math.max(fun(nums,idx+2),fun(nums,idx+3));
    }
    public int rob(int[] nums) {
        return fun(nums,0);
    }
}