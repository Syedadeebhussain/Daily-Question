// Last updated: 4/9/2025, 8:10:00 am
class Solution {
    public int findClosest(int x, int y, int z) {
     int r1=Math.abs(x-z);
     int r2=Math.abs(y-z);
     if(r1>r2){
        return 2;
     }
     else if(r2>r1){
        return 1;
     }
     else if(r1==r2){
        return 0;
     }
     return -1;
    }
}