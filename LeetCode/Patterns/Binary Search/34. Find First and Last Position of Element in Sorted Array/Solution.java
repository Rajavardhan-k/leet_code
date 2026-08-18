class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int [] a={-1,-1};
        while(low<=high){
            int mid=low+((high-low)/2);
            if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=low+1;
            }
            else if(nums[mid]==target){
                if(nums[mid+1]==target) high=mid+1;
                else high=mid;
                a[1]=high;
                while(low<=high){
                    if(nums[low]==target){
                        a[0]=low;
                        return a;
                    }
                    else{
                        low++;
                    }
                }
            }
        }
        return a;
    }
}