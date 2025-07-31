// Last updated: 31/7/2025, 2:27:42 pm
class Solution {
    public void solveSudoku(char[][] board) {
       print(board,0,0); 
       for(int p=0;p<board.length;p++){
            for(int q=0;q<board[0].length;q++){
                System.out.print(board[p][q]+" ");
            }
            System.out.println();
    }
    }
    public static boolean print(char[][] board,int row,int col)
    {
        if(col==9)
        {
            col=0;
            row++;
        }
        if(row==9)
        {
          return true;
        }
        if(board[row][col]!='.')
        {
          return print(board,row,col+1);
        }
        else
        {
          for(char i='1';i<='9';i++){
            if(isvalid(board,row,col,i)){
                board[row][col]=i;
               boolean ans= print(board,row,col+1);
               if(ans)
               {
                    return true;
               }
                board[row][col]='.';
            }
          }
        }
        return false;
    }
    public static boolean isvalid(char[][] board,int row,int col,int val)
    {
        //row
        for(int i=0;i<board[0].length;i++){
            if(board[row][i]==val)
            {
                return false;
            }
        }
        //col
        for(int i=0;i<board.length;i++){
            if(board[i][col]==val)
            {
                return false;
            }
        }
        int r=row-row%3;
        int c=col-col%3;
        for(int p=r;p<r+3;p++){
            for(int q=c;q<c+3;q++){
                if(board[p][q]==val)
                {
                    return false;
                }
            }
        }
        return true;
    }
    // public static void Display(char [][] board)
    // {
        
        }
    // }
