// Last updated: 9/1/2026, 10:51:48 pm
1class Solution {
2    public int countBattleships(char[][] board) {
3        int c=0;
4        for(int i=0;i<board.length;i++){
5            for(int j=0;j<board[0].length;j++){
6                if(board[i][j]=='X'){
7                    boolean top = (i-1>=0 && board[i-1][j]=='X');
8                    boolean left = (j-1>=0 && board[i][j-1]=='X');
9                    if(!top && !left ){
10                        c++;
11                    }
12                }
13            }
14        }
15        return c;
16    }
17}