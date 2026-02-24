// Last updated: 24/2/2026, 12:13:21 pm
1class Solution {
2    public boolean validMountainArray(int[] arr) {
3     int i=0;
4     while(i<arr.length-1 && arr[i]<arr[i+1]){
5        i++;
6     }   
7     if(i==0 || i==arr.length-1) return false;
8     while(i<arr.length-1 && arr[i]>arr[i+1]){
9        i++;
10     }
11     if(i==arr.length-1) {
12        return true;
13     }
14     return false;
15    }
16}