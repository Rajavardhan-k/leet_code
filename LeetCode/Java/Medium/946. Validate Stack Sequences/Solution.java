class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int i=0;
        int j=0;
        int count=0;
        while(i<pushed.length){
            st.push(pushed[i]);
            while(!st.isEmpty() && st.peek()==popped[j]){
                st.pop();
                j++;
                count++;
            }
            i++;
        }
        if(count<popped.length){
            return false;
        }
        return true;
    }
}