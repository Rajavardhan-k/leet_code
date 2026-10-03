class Solution {
    public String removeOuterParentheses(String s) {
        String st="";
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
            if (count==0) {
                int k=i+1;
                while (k<j) {
                    st=st+s.charAt(k);
                    k++;
                }
                i=j+1;
            }
            j++;
        }
        return st;
    }
}