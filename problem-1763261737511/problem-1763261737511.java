// Last updated: 16/11/2025, 8:25:37 am
class Solution {
    public int minLengthAfterRemovals(String s) {
    int c1=0;
    int c2=0;
        for(char ch:s.toCharArray()){
            if(ch=='a') {
                c1++;
            }
            else{
                c2++;
            }
        }
        return Math.abs(c1-c2);
    }
}