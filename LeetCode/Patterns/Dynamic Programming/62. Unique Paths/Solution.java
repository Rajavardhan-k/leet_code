class Solution {
    int fun(int n,int m,int i,int j){
        if(i>=n||j>=m) return 0;
        else if(i==n-1&&j==m-1) return 1;
        int down=fun(n,m,i+1,j);
        int right=fun(n,m,i,j+1);
        return down+right;
    }
    public int uniquePaths(int m, int n) {
        int memo[]=new int[nums.length+1];
        Arrays.fill(memo,-1);
        return fun(n,m,0,0);
    }
}