// Last updated: 5/10/2025, 5:52:56 pm
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
     int [] arr=new int [rocks.length];
     for(int i=0;i<arr.length;i++){
        arr[i]=capacity[i]-rocks[i];
     }
     int c=0;
     Arrays.sort(arr);
     for(int i=0;i<arr.length;i++){
        if(arr[i]<=additionalRocks){
            additionalRocks-=arr[i];
            arr[i]=0;
        }
        
     }
     for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            c++;
        }

     }
     return c;
    }
}