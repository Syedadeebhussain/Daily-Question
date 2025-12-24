// Last updated: 24/12/2025, 12:54:26 pm
1class Solution {
2    public int countCollisions(String directions) {
3      int i=0,j=directions.length()-1;
4      int n=directions.length();
5       while(i<n && directions.charAt(i)=='L'){
6        i++;
7       }
8       while(j>=0 && directions.charAt(j)=='R'){
9        j--;
10       }
11       int c=0;
12       for(int k=i;k<=j;k++){
13        if(directions.charAt(k)!='S'){
14            c++;
15        }
16       }
17       return c;
18    }
19}