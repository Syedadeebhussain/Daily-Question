// Last updated: 9/9/2025, 11:38:18 am
class Solution {
    public int[] getNoZeroIntegers(int n) {
    int [] arr=new int [2];
    for(int i=1;i<n;i++){
        if(check(i) && check(n-i)){
            arr[0]=i;
            arr[1]=n-i;
            break;
        }

    }
    return arr;
    }
    public boolean check(int n){
        while(n>0){
            if(n%10==0){
                return false;
            }
            n/=10;
        }
        return true;
    }
}