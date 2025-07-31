// Last updated: 31/7/2025, 2:24:11 pm
class Solution {
    public boolean halvesAreAlike(String s) {
    int c1=count(s.substring(0,s.length()/2));
     int c2=count(s.substring((s.length()/2)));
     if(c1==c2){
        return true;
     }
      return false;  
    }
    public int count(String s){
        int c1=0;
        for(char c:s.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                c1++;
            }
        }
        return c1;
    }
}