class Solution {
    public int minMaxGame(int[] nums) {
        int n=nums.length;
        while(n>1){
            int newnums[]=new int [n/2];
            for(int i=0;i<n/2;i++){
                if(i%2==0){
                    newnums[i]=Math.min(nums[2*i], nums[2*i+1]);
                }
                else {
                    newnums[i]=Math.max(nums[2*i],nums[2*i+1]);
                }
            }
            n=n/2;
        }
        return nums[0];
    }
}