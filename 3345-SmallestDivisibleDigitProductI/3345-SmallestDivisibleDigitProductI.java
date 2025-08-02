// Last updated: 2/8/2025, 12:39:28 pm
class Solution {
    public int smallestNumber(int n, int t) {
        int i=n;
        while(i>=n){
            if(isproduct(i)%t==0){
                return i;
            }
            i++;
        }
        return 0;
    }
    public int isproduct(int n){
        int p=1;
        while(n!=0){
            p*=n%10;
            n/=10;
        }
        return p;
    }
}