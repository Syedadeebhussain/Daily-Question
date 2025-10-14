// Last updated: 14/10/2025, 9:43:40 pm
class Solution {
    public int minimumDeleteSum(String word1, String word2) { 
       int n=word1.length();
       int m=word2.length();
       int [][] dp=new int [n+1][m+1];
       for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(word1.charAt(i-1)==word2.charAt(j-1)){
                dp[i][j]=dp[i-1][j-1]+word1.charAt(i - 1);
                //here in this i am storing the ascii sum
            }
            else{
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
       }
        int totalSum = 0;
        for (char c : word1.toCharArray()) totalSum += c;
        for (char c : word2.toCharArray()) totalSum += c;
        return totalSum - 2 * dp[n][m];
    }
}