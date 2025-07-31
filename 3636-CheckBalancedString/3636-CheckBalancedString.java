// Last updated: 31/7/2025, 2:21:32 pm
class Solution {
    public boolean isBalanced(String num) {
        long so=0,se=0;
        for(int i=0;i<num.length();i++)
        {
          if(i%2==0){
            se+=num.charAt(i)-'0';
          } 
          else
          {
             so+=num.charAt(i)-'0';
          } 
        }
        return se==so;
    }
}