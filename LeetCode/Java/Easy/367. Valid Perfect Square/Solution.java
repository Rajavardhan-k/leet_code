class Solution {
    public boolean isPerfectSquare(int num) {
        long low=1;
        long high=num;
        while(low<=high){
            long mid=low+((high-low)/2);
            long sq=mid*mid;
            if(sq>num){
                high=mid-1;
            }
            else if(sq<num){
                low=mid+1;
            }
            else if(sq==num){
                return true;
            }
        }
        return false;
    }
}