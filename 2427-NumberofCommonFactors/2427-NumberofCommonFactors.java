// Last updated: 31/7/2025, 10:04:46 pm
class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        for(int i=1;i<=Math.max(a,b);i++){
            if(a%i==0 && b%i==0){
                c++;
            }
        }
        return c;
    }
}