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
            if(nums[mid]<target){
                low=low+1;
            }
            if (nums[mid] == target) {
            int l = mid, r = mid;
            while (l > 0 && nums[l - 1] == target) l--;
            while (r < nums.length - 1 && nums[r + 1] == target) r++;
            a[0] = l;
            a[1] = r;
            break;
        }
        }
        return a;
    }
}