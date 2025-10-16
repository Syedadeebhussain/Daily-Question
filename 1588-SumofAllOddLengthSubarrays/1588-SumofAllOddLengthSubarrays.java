// Last updated: 16/10/2025, 10:35:54 pm
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
     for(int i=0;i<arr.length;i++){
        int contri=(i+1)*(arr.length-i);
        int oddno=(int)Math.ceil(contri/2.0); // each element will appear equal in even length and odd length subarray
        sum+=arr[i]*oddno;
     }   
     return sum;
    }
}