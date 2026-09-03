class Solution {
    public int[] productExceptSelf(int[] nums) {
      int count=0;int multi=1;
      int ans[]=new int[nums.length];
      for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            count++;
        }
        else{
            multi *= nums[i];
        }
      }
      for (int i=0;i<nums.length;i++) {
            if (count>1) {
                ans[i] = 0;
            } else if (count==1) {
                if (nums[i] == 0) {
                    ans[i] = multi;
                } else {
                    ans[i] = 0;
                }
            } else {
                ans[i] = multi / nums[i];
            }
        }
      return ans;  
    }
}