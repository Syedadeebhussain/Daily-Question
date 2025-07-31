// Last updated: 31/7/2025, 2:24:49 pm
class Solution {
    public int subtractProductAndSum(int n) {
     int product=pro(n);
     int sum=sum(n);
     return sum-product;   
    }
    public int pro(int n){
        int s=0;
        while(n>0){
            int r=n%10;
            s+=r;
            n=n/10;
        }
        return s;
    }
     public int sum(int n){
         int p=1;
        while(n>0){
            int r=n%10;
            p*=r;
            n=n/10;
        }
        return p;
    }
}