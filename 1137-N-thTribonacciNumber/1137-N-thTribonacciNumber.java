// Last updated: 13/9/2025, 11:36:23 pm
class Solution {
    public int tribonacci(int n) {
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);
       return find(n,dp);
    }
    public int find(int n,int [] dp){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
      
        int a=find(n-1,dp);
        int b=find(n-2,dp);
        int c=find(n-3,dp);
        return dp[n]=a+b+c;
    }
}
