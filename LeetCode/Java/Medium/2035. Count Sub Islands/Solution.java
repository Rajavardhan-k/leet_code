class Solution {
    void helper(int grid2[][],int i,int j,int grid1[][]){
        if(i<0||j<0||i>=grid2.length||j>=grid2[0].length) return;
        if(grid2[i][j]==0) return;
        grid2[i][j]=0;
        helper(grid2,i+1,j,grid1);
        helper(grid2,i,j+1,grid1);
        helper(grid2,i-1,j,grid1);
        helper(grid2,i,j-1,grid1);
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int count=0;
        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2[0].length;j++){
                if(grid2[i][j]==1&&grid2[i][j]==grid1[i][j]){
                    helper(grid2,i,j,grid1);
                    count++;
                }
            }
        }
        return count-1;
    }
}