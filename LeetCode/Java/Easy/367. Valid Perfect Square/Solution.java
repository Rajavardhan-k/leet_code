class Solution {
    public boolean isPerfectSquare(int num) {
        int low=1;
        int high=num;
        if(num==1) return true;
        while(low<high){
            int mid=low+((high-low)/2);
            if(mid*mid>num){
                high=mid-1;
            }
            else if(mid*mid<num){
                low=mid+1;
            }
            else if(mid*mid==num){
                return true;
            }
        }
        return false;
    }
}