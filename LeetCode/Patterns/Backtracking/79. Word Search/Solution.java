class Solution {
    boolean ans;
    void find(int i,int j,int idx,char board[][],String word){
        if(idx>=word.length()){
            ans=true;
            return;
        }
        if(i<0||j<0||i>=board.length||j>=board[0].length) return;
        if(ans==true) return;
        if(board[i][j]!=word.charAt(idx)) return;
        char temp=board[i][j];
        board[i][j]='*';
        find(i+1,j,idx+1,board,word);
        find(i-1,j,idx+1,board,word);
        find(i,j+1,idx+1,board,word);
        find(i,j-1,idx+1,board,word);
        board[i][j]=temp;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    find(i,j,0,board,word);
                    if(ans==true) return true;
                }
            }
        }
        return false;
    }
}