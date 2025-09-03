// Last updated: 3/9/2025, 8:30:05 pm
class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            if(isPrime(nums[start])){
                break;
            }
            start++;
        }
        while(end>=start){
            if(isPrime(nums[end])){
                break;
            }
            end--;
        }
        return end-start;
    }

    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i =5; i*i<=n;i=i+6){

            if((n%i==0) ||(n%(i+2)==0) ){
                return false;
            }
        }
        return true;
    }
}