// Last updated: 14/10/2025, 7:59:22 pm
class Solution {
    public int minInsertions(String s) {
    StringBuilder st=new StringBuilder(s);
        st.reverse();
       return find(s,st.toString());
    }
    public int find(String s1,String s2){
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
        return s1.length()-dp[s1.length()][s2.length()];
    }
}