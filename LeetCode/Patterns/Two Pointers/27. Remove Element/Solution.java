class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        int k=0;
        int temp=0;
        while(j<nums.length){
            if(nums[j]==val){
                j++;
            }
            else{
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=val){
                k++;
            }
        }
        return k;
    }
}