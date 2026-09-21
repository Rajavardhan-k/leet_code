class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int diff;
        if(k==1){
            diff=0;
        }
        else {
            diff=nums[nums.length-1]-nums[nums.length-k];
        }
        return diff;
    }
}