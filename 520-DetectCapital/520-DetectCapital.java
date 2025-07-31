// Last updated: 31/7/2025, 2:25:38 pm
class Solution {
    public boolean detectCapitalUse(String word) {
    int c=0;
    char ch1=word.charAt(0);
     for(int i=0;i<word.length();i++)
     {
        char ch=word.charAt(i);
        if( Character.isUpperCase(ch))
        {
            ++c;
        }
     }  
     if(c==(word.length()))
     {
        return true;
     } 
     else if(c==0)
     {
        return true;
     }
     
     else if(c==1 && Character.isUpperCase(ch1))
     {
        return true;
     }
     else
     {
        return false;
     }
    }
}