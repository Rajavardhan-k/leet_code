class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff=Integer.MAX_VALUE;
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int k=nums.length-1;
            int j=i+1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target) return sum;
                if(Math.abs(sum-target)<diff){
                    diff=Math.abs(sum-target);
                    ans=sum;
                }
                if(sum>target) k--;
                else j++;
            }
        }
        return ans;
    }
}