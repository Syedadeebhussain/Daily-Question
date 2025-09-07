// Last updated: 7/9/2025, 8:46:27 am
class Solution {
    public int[] sumZero(int n) {
    int [] arr=new int [n];
    int j=0;
    for(int i=1;i<=n/2;i++){
         arr[j++]=i;
         arr[j++]=-i;
    }
    if(n%2!=0) {
        arr[j]=0;
    }
    return arr;
    }
}