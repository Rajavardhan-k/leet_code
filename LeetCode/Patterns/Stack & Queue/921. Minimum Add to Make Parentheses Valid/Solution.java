class Solution {
    public int minAddToMakeValid(String s) {
        int i=0;
        int j=0;
        int count=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(ch=='('){
                count++;
            }
            else if(ch==')'){
                count--;
            }
            if(count<0){
                count=count*(-1);
            }
            j++;
        }
        return count;
    }
}