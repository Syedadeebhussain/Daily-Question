// Last updated: 18/10/2025, 6:24:20 am
class Solution {
    public int[] decode(int[] encoded, int first) {
      int [] arr=new int [encoded.length+1];
      arr[0]=first;
      for(int i=0;i<encoded.length-1;i++){
        arr[i+1]=encoded[i]^arr[i];
      }  
      arr[arr.length-1]=encoded[arr.length-2]^arr[arr.length-2];
      return arr;
    //   encoded[i] = arr[i] XOR arr[i+1], then arr[i+1] = encoded[i] XOR arr[i].
    }
}