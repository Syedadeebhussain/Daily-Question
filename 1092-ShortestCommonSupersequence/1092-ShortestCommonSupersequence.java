// Last updated: 4/11/2025, 7:27:36 pm
class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        return find(str1,str2);
    }
    public String find(String s1,String s2){
        int [][] dp=new int [s1.length()+1][s2.length()+1];
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
      StringBuilder st=new StringBuilder();
      int i=s1.length();
      int j=s2.length();
      while(i>0 && j>0){
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            st.append(s1.charAt(i-1));
            i--;
            j--;
        }
        else if (dp[i-1][j] > dp[i][j-1]) {
            st.append(s1.charAt(i-1));
            i--;
        } 
            else { 
                st.append(s2.charAt(j-1));
                j--;
            }
      }
while (i > 0) st.append(s1.charAt(--i));
while (j > 0) st.append(s2.charAt(--j));
       return st.reverse().toString();
    }
}