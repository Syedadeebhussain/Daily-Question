// Last updated: 31/7/2025, 2:24:51 pm
class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int left=0,right=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                right++;
            }
            else{
                left++;
            }
            if(left==right){
                count++;
            }
        }
        return count;
    }
}