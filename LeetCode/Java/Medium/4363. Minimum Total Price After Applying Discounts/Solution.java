class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i=prices.length-1;
        int j=discounts.length-1;
        double temp=0;
        while(i>=0 && j>=0){
            double dis=(prices[i]*(100-discounts[j]))/100.0;
            temp=temp+dis;
            i--;j--;
        }
        while(i>=0){
            temp=temp+prices[i];
            i--;
        }
        return temp;
    }
}