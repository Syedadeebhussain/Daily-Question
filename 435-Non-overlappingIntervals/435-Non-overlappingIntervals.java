// Last updated: 11/2/2026, 6:08:01 pm
1class Solution {
2    public int eraseOverlapIntervals(int[][] arr) {
3     Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
4     int c=1;
5     int p=arr[0][1];
6     for(int i=0;i<arr.length;i++){
7        if(arr[i][0]>=p){
8            c++;
9            p=arr[i][1];// i am free after that
10        }
11     } 
12     return arr.length-c;  
13    }
14}