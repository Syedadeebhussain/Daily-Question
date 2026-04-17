// Last updated: 18/4/2026, 12:11:13 am
1class Solution {
2    public int totalNQueens(int n) {
3     boolean [][] chess=new boolean[n][n];
4    return solve(chess,0,n);
5    
6    }
7       public static int solve(boolean[][] chess, int row, int tq) {
8        if (tq == 0) {
9            return 1;
10        }
11        if (row >= chess.length) {
12            return 0;
13        }
14        int count = 0;
15        for (int i = 0; i < chess[0].length; i++) {
16            if (isvalid(chess, row, i)) {
17                chess[row][i] = true;
18                count += solve(chess, row + 1, tq - 1);
19                chess[row][i] = false;
20            }
21        }
22        return count;
23    }
24    public static boolean isvalid(boolean [][] chess,int row,int col)
25    {
26        //up
27        int r=row;
28        while(r>=0)
29        {
30           if(chess[r][col]==true)
31           {
32            return false;
33           }
34           r--;
35        }
36        // right diagonal
37        r=row;
38        int c=col;
39        while(r>=0 && c<chess[0].length){
40            if(chess[r][c]==true)
41           {
42            return false;
43           }
44           r--;
45           c++;
46        }
47
48        //left diagonal
49        r=row;
50        c=col;
51        while(r>=0 && c>=0){
52            if(chess[r][c]==true)
53           {
54            return false;
55           }
56           r--;
57           c--;
58        }
59        return true;
60    }
61    public static String addkaro(int c,int n){
62        StringBuilder st=new StringBuilder();
63        for(int i=0;i<n;i++){
64            if(i==c){
65                st.append("Q");
66            }
67            else{
68                st.append(".");
69            }
70        }
71        return st.toString();
72    }
73}