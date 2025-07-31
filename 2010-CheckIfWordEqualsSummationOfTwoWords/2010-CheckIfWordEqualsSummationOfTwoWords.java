// Last updated: 31/7/2025, 2:23:46 pm
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord)   
    {
     int s1=sum(firstWord);
      int s2=  sum(secondWord);
       int s3=  sum(targetWord);
       if(s1+s2==s3){
        return true;
       }
       return false;
    }
    public int sum(String s){
        int sum=0;
        StringBuilder st =new StringBuilder();
        for(int i=0;i<s.length();i++){
            st.append(s.charAt(i)-'a');
                    }
                    return Integer.parseInt(st.toString());
    }
}