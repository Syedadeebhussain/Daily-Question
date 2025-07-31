// Last updated: 31/7/2025, 2:24:28 pm
class Solution {
    public int xorOperation(int n, int start) {
        int  s=0;
        for(int i=0;i<n;i++){
            s^=start+2*i;
        }
    return s;
    }
}