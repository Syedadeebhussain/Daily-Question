// Last updated: 5/8/2025, 2:59:28 pm
class Solution {
    public int pivotInteger(int n) {
    if(n==1){
        return 1;
    }
    int [] arr=new int [n];
    arr[0]=1;
    for(int i=1;i<n;i++){
        arr[i]=arr[i-1]+(i+1);
    }
    for(int i=1;i<n;i++){
        if(arr[i]==(arr[n-1]-arr[i-1])){
            return i+1;
        }
    }
    return -1;
    }
}
// class Solution {
//     public int pivotInteger(int n) {
//     if(n==1){
//         return 1;
//     }
//     for(int i=1;i<n;i++){
//         if(pivot(i,n)) return i;
//     }
//     return -1;
//     }
//     public boolean pivot(int pi,int n){
//         int sum=0;
//         for(int i=1;i<=pi;i++){
//             sum+=i;
//         }
//         int sum2=0;
//         for(int i1=pi;i1<=n;i1++){
//             sum2+=i1;
//         }
//         return sum==sum2;
//     }
// }