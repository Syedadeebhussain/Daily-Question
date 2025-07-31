// Last updated: 31/7/2025, 2:24:08 pm
class Solution {
    public int largestAltitude(int[] gain) {
     int [] arr=new int [gain.length+1];
     arr[0]=0;
     for(int i=1;i<arr.length;i++){
       arr[i]=arr[i-1]+gain[i-1];
     }   
     int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}