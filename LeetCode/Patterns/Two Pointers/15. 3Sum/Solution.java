class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int k=nums.length-1;
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            while(j<k){
                ArrayList<Integer> al=new ArrayList<>();
                if(nums[i]+nums[j]+nums[k]==0){
                    al.add(nums[i]);
                    al.add(nums[j]);
                    al.add(nums[k]);
                    j++;
                    k--;
                    arr.add(al);
                }
                else if(nums[i]+nums[j]+nums[k]<0) j++;
                else k--;
            }
        }
        return arr;
    }
}