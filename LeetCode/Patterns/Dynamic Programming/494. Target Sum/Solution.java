class Solution {
    int c=0;
    void find(int nums[],int idx,int sum,int target){
        if(idx>=nums.length){
            if(sum==target) c++;
            return;
        }
        find(nums,idx+1,sum+nums[idx],target);
        find(nums,idx+1,sum-nums[idx],target);
    }
    public int findTargetSumWays(int[] nums, int target) {
        find(nums,0,0,target);
        return c;
    }
}