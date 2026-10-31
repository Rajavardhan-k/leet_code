class Solution {
    int fun(int n,int m,int i,int j,int memo[][]){
        if(i>=n||j>=m) return 0;
        else if(i==n-1&&j==m-1) return 1;
        if(memo[i][j]!=-1) return memo[i][j];
        int down=fun(n,m,i+1,j,memo);
        int right=fun(n,m,i,j+1,memo);
        memo[i][j]=down+right;
        return memo[i][j];
    }
    public int uniquePaths(int m, int n) {
        int memo[][]=new int[n][m];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return fun(n,m,0,0,memo);
    }
}