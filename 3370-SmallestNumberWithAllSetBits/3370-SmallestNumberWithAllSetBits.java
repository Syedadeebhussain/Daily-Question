// Last updated: 29/10/2025, 8:59:30 pm
class Solution {
    public int smallestNumber(int n) {
        int i=1;
        while(i>0){
            if((int)Math.pow(2,i)-1>=n){
                return (int)Math.pow(2,i)-1;
            }
            i++;
        }
        return 0;
    }
}