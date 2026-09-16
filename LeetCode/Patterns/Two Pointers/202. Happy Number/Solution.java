class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        while(temp>9){
            int sum = 0;
            while(temp>0){
                int rem = temp%10;
                sum = sum+(rem*rem);
                temp=temp/10;
            }
            temp=sum;
        }
        if(temp==1||temp==7){
            return true;
        }
        else{
            return false;
        }
    }
}