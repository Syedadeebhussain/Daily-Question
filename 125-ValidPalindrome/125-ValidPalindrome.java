// Last updated: 31/7/2025, 2:26:54 pm
class Solution {
    public boolean isPalindrome(String s) {
    s=s.toLowerCase();
      StringBuilder sb = new StringBuilder();
      for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i) >='0' && s.charAt(i)<='9') ){
                sb.append(s.charAt(i));
            }
      }
      String w = sb.toString();
    // amanaplanacanalpanama
    int i1=0;
    int j=w.length()-1;
    while(i1<=j){
        if(w.charAt(i1)!=w.charAt(j)){
            return false;
        }
        i1++;
        j--;
    }
   return true;
    }
}