// Last updated: 5/8/2025, 2:58:47 pm
class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
     for(int i=0;i<nums.length;i++){
        int len=0;
        int max=Integer.MIN_VALUE;
        int n=nums[i];
        while(n!=0){
            int r=n%10;
            max=Math.max(max,r);
            n/=10;
            len++;
        }
        if(len==0){
            len=1;
        }
           int encrypted = 0;
            for (int i1 = 0; i1 < len; i1++) {
                encrypted = encrypted * 10 + max;
            }
            sum+=encrypted;
     }   
     return sum;

    }
}