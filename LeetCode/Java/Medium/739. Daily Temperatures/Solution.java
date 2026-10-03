class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int i=temperatures.length-1;
        int ans[]=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        while (i>=0) {
            while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                ans[i]=st.peek()-i;
            } else {
                ans[i]=0;
            }
            st.push(i);
            i--;
        }
        return ans;
    }
}