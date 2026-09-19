class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        String str="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!st.isEmpty() && st.peek()==c){
                st.pop();
                
            }
            else st.push(c);
        }
        while (!st.isEmpty()) {
            str=st.pop()+str; 
        }
        return str;
    }
}