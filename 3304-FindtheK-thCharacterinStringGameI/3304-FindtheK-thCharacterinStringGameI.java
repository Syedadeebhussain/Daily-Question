// Last updated: 18/10/2025, 7:47:54 am
class Solution {
    public char kthCharacter(int k) {
     String s="a";
     return find(s,k);  
    }
public char find(String s,int k){
   while(s.length()<=k){
    StringBuilder st=new StringBuilder();
    for(int i=0;i<s.length();i++){
        int a=s.charAt(i)+1;
        st.append((char)a);
    }
    s=s+(st.toString());
   }
   return s.charAt(k-1);
}  

}