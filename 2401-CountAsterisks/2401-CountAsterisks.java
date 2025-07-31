// Last updated: 31/7/2025, 2:22:59 pm
class Solution {
    public int countAsterisks(String s) {
        int ans=0;
        int c=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='|'){
            c++;
        }
        if(c%2==0){
            if(s.charAt(i)=='*'){
                ans++;
            }
        }
      }
      return ans;  
    }
}