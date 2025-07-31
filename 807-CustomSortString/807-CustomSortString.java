// Last updated: 31/7/2025, 2:25:19 pm
class Solution {
    public String customSortString(String order, String s) {
        String str="";
      for(int i=0;i<order.length();i++){
         char ch=order.charAt(i);
         for(int j=0;j<s.length();j++){
         if(s.charAt(j)==ch){
            str+=ch;
         }
         }
         
      }  
      for(int i=0;i<s.length();i++){
        char ch1=s.charAt(i);
        if(order.indexOf(ch1) == -1){
            str+=ch1;
        }
      }
     return str;
    }
}