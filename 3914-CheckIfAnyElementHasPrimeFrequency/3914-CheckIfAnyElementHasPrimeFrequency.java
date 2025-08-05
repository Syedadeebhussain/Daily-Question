// Last updated: 5/8/2025, 2:58:10 pm
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int [] fre=new int[101];
        for(int i=0;i<nums.length;i++){
            fre[nums[i]]++;
        }
        for(int j=0;j<fre.length;j++){
            if(isPrime(fre[j])){
                return true;
            }
        }
        return false;
    }
    public boolean isPrime(int n) {
        if (n < 2) return false;  
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}