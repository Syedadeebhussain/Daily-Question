// Last updated: 31/7/2025, 2:21:51 pm
class Solution {
    public boolean isValid(String word) {
        int c=0,ce=0,co=0;
      for(int i=0;i<word.length();i++){
            if(!Character.isDigit(word.charAt(i)) && !Character.isLetter(word.charAt(i))){
                    return false;
            }
            char ch=word.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                ce++;
            }
            else if(Character.isLetter(ch)){
                co++;
            }
      }  
      if( ce>=1 && co>=1 && word.length()>=3){
        return true;
      }
      return false;
    }
}