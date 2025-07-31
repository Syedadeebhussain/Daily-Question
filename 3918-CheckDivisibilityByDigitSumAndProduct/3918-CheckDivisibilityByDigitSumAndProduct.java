// Last updated: 31/7/2025, 2:21:22 pm
class Solution {
    public boolean checkDivisibility(int n) {
        int p=1;
        int sum=0;
        int num=n;
        while(n!=0){
            int r=n%10;
            p*=r;
            sum+=r;
            n/=10;
        }
        return num%(p+sum)==0 ?true:false;
    }
}