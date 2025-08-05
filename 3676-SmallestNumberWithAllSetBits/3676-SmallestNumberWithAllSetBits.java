// Last updated: 5/8/2025, 2:58:23 pm
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