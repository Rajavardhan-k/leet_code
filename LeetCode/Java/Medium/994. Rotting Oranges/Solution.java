class Solution {
    void find(int grid[][],int i,int j,int m){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length) return;
        if(grid[i][j]==0) return;
        if (grid[i][j]>1 && grid[i][j]<m) return;
        grid[i][j]=m;
        find(grid,i+1,j,m+1);
        find(grid,i,j+1,m+1);
        find(grid,i,j-1,m+1);
        find(grid,i-1,j,m+1);

    }
    public int orangesRotting(int[][] grid) {
        int time=2;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    find(grid,i,j,2);
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) return -1;
                time=Math.max(time,grid[i][j]);
            }
        }
        return time-2;
    }
}