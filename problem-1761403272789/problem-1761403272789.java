// Last updated: 25/10/2025, 8:11:12 pm
class Solution {
    public String lexSmallest(String s) {
        String res=s;
       for(int i=1;i<=s.length();i++){
           StringBuilder s1=new StringBuilder();
           s1.append(new StringBuilder(s.substring(0,i)).reverse());
           String temp=s.substring(i);
           s1.append(temp);
           if(s1.toString().compareTo(res)<0){
               res=s1.toString();
           }

           StringBuilder s2=new StringBuilder();
           String temp2=s.substring(0,s.length()-i);
           s2.append(temp2);
           s2.append(new StringBuilder(s.substring(s.length()-i)).reverse());
           if(s2.toString().compareTo(res)<0){
               res=s2.toString();
           }
           
       } 
        return res;
    }
}