// Last updated: 31/7/2025, 7:54:20 pm
class Solution {
    public int pivotInteger(int n) {
    if(n==1){
        return 1;
    }
    for(int i=1;i<n;i++){
        if(pivot(i,n)) return i;
    }
    return -1;
    }
    public boolean pivot(int pi,int n){
        int sum=0;
        for(int i=1;i<=pi;i++){
            sum+=i;
        }
        int sum2=0;
        for(int i1=pi;i1<=n;i1++){
            sum2+=i1;
        }
        return sum==sum2;
    }
}