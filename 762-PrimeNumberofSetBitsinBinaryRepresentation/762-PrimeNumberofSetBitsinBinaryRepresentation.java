// Last updated: 2/8/2025, 12:34:58 pm
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c=0;
    for(int i=left;i<=right;i++){
        int n=Integer.bitCount(i);
        if(isPrime(n)){
          c++;
        }
    }   
    return c; 
    }
    public boolean isPrime(int n){
        int c=0;
         if (n < 2) return false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}