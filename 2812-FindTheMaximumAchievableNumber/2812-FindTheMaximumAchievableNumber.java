// Last updated: 31/7/2025, 2:22:24 pm
class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int x=num;
        for(int i=0;i<t;i++){
            x+=2;
        }
        return x;
    }
}