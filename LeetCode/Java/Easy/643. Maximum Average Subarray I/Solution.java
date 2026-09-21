class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i = 0; i < k; i++) {
            sum+=nums[i];
        }
        int Sum=sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            Sum = Math.max(Sum, sum);
        }
        return (double) Sum / k;
    }
}