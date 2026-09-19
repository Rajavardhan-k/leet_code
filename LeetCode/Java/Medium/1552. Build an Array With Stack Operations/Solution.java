class Solution {
    public List<String> buildArray(int[] target, int n) {
        int i=1;
        int j=0;
        Stack<String> st=new Stack<>();
        while(j<target.length){
            if(i==target[j]){
                st.push("Push");
                i++;
                j++;
            }
            else{
                st.push("Push");
                st.push("Pop");
                i++;
            }
        }
        return st; 
    }
}