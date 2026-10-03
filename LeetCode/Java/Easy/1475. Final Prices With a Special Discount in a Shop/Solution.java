class Solution {
    public int[] finalPrices(int[] prices) {
        int i=prices.length-1;
        ArrayList<Integer> a=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[prices.length];
        while (i>= 0) {
            while (!st.isEmpty()&&st.peek()>prices[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i]=prices[i];
            } else {
                ans[i]=prices[i]-st.peek();
            }
            st.push(prices[i]);
            i--;
        }
        for (int k=0; k<ans.length;k++) {
            a.add(ans[k]);
        }
        return ans;
    }
}