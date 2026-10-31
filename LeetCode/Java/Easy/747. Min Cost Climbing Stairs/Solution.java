class Solution {
    int fun(int cost[],int idx){
        if(idx>=cost.length) return 0;
        return cost[idx]+Math.min(fun(cost,idx+1),fun(cost,idx+2));
    }
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(fun(cost,0),fun(cost,1));
    }
}