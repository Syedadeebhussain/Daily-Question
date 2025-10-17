// Last updated: 17/10/2025, 10:36:05 pm
class Solution {
    public int numberOfMatches(int n) {
    int sum=0;
     int num=n;
    while(num!=1){
       if(num%2==0){
        sum+=num/2;
        num=num/2;
       }
       else{
        sum+=(num-1)/2;
        num=(num-1)/2+1;
       }
     }
     return sum;
    }
}