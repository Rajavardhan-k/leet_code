class Solution {
    public int minAddToMakeValid(String s) {
        int i=0;
        int j=0;
        int count=0;
        int add=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(ch=='('){
                count++;
            }
            else{
                if(count>0){
                    count--;
                }
                else{
                    add++;
                }
            }
            j++;
        }
        return count+add;
    }
}