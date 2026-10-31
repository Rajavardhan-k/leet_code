class Solution {
    int fun(int nums[],int idx,int memo[]){
        if(idx>=nums.length) return 0;
        if(memo[idx]!=-1) return memo[idx];
        memo[idx]=nums[idx]+Math.max(fun(nums,idx+2,memo),fun(nums,idx+3,memo));
        return memo[idx];
    }
    public int rob(int[] nums) {
        int memo[]=new int[nums.length+1];
        Arrays.fill(memo,-1);
        if(nums.length==3){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        return Math.max(fun(nums,0,memo),fun(nums,1,memo));
    }
}