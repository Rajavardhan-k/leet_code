class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0;
        int j=1;
        int temp=0;
        while(i<nums.length && j<nums.length){
            if(i%2==0 && nums[i]%2==0){
                i=i+2;
            }
            else if(j%2==1 && nums[j]%2==1){
                j=j+2;
            }
            else{
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j=j+2;
                i=i+2;
            }
        }
        return nums;
    }
}