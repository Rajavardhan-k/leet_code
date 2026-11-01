class Solution {
    int fun(int[] nums, int idx, int end, int[] memo) {
        if (idx > end) return 0;
        if (memo[idx] != -1) return memo[idx];
        int take = nums[idx] + fun(nums, idx + 2, end, memo);
        int skip = fun(nums, idx + 1, end, memo);
        return memo[idx] = Math.max(take, skip);
    }
    int solve(int[] nums, int start, int end) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return fun(nums, start, end, memo);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        return Math.max(
            solve(nums, 0, n - 2),
            solve(nums, 1, n - 1)
        );
    }
}