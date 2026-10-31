class Solution {
    int fun(int cost[],int idx,int memo[]){
        if(idx>=cost.length) return 0;
        if(memo[idx]!=-1) return memo[idx];
        memo[idx]=cost[idx]+Math.min(fun(cost,idx+1,memo),fun(cost,idx+2,memo));
        return memo[idx];
    }
    public int minCostClimbingStairs(int[] cost) {
        int memo[]=new int[cost.length+1];
        Arrays.fill(memo,-1);
        return Math.min(fun(cost,0,memo),fun(cost,1,memo));
    }
}