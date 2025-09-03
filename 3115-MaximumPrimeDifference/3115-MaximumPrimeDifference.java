// Last updated: 3/9/2025, 8:24:59 pm
class Solution {
    public int maximumPrimeDifference(int[] nums) {
       int  min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(prime(nums[i]))
            {
               min=Math.min(i,min);
               max=Math.max(i,max);
            }
        }
        return max-min;
    }
    public boolean prime(int n){
        if(n==2 ){
            return true;
        }
        if(n==1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}