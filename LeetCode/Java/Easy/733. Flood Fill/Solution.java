class Solution {
    void find(int image[][],int i,int j,int color,int o){
        if(i<0||j<0||i>=image.length||j>=image[0].length) return;
        if(image[i][j]!=o) return;
        image[i][j]=color;
        find(image,i+1,j,color,o);
        find(image,i,j+1,color,o);
        find(image,i,j-1,color,o);
        find(image,i-1,j,color,o);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int o=image[sr][sc];
        if(o!=color){
            find(image,sr,sc,color,o);
        }
        return image;
    }
}