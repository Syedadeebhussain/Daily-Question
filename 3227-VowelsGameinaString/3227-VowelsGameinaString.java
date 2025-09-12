// Last updated: 12/9/2025, 8:39:53 am
class Solution {
    public boolean doesAliceWin(String s) {
    for(char ch:s.toCharArray()){
        if(ch=='a' ||ch=='e' ||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
    }
        return false;
    
    }
}