// Last updated: 31/7/2025, 2:25:40 pm
class Solution {
    public boolean checkPerfectNumber(int num) {
        int n=num;
        int s=0;
         if(num == 1) return false;
        for(int i=1;i<=num/2;i++){
            if(n%i==0){
             s+=i;
            }
        }
        return s==num;
    }
}