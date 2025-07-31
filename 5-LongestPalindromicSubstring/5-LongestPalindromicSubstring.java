// Last updated: 31/7/2025, 2:28:06 pm
class Solution {
    public String longestPalindrome(String s) {
        int max=Integer.MIN_VALUE;
        String ans="";
        if(s.length()<=1){
            return s;
        }
         if(ispal(s)){
            return s;
        } 
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(ispal(s.substring(i,j))){
                   if(max<(s.substring(i,j)).length()){
                    max=(s.substring(i,j)).length();
                    ans=s.substring(i,j);
                   }
                }
            }
        }
        return ans;
    }
    public static boolean ispal(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}