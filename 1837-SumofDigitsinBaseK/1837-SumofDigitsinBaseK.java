// Last updated: 31/7/2025, 10:16:15 pm
class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % k;
			sum = sum + rem * mul;
			n = n / k;
			mul = mul * 10;
		}   
        return summation(sum);
    }
    public int summation(int n){
        int s=0;
        while(n!=0){
            s+=n%10;
            n/=10;

        }
        return s;
    }
}