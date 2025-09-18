// Last updated: 18/9/2025, 12:21:04 pm
class Solution {
    public int maxCoins(int[] arr) {
    int [] a=new int [arr.length+2];
     a[0]=a[a.length-1]=1;
     for(int i=0;i<arr.length;i++) {
    	 a[i+1]=arr[i];
     }
     int [][] dp=new int [a.length][a.length];
     return Burst_coin(a,0,a.length-1,dp);
	}

	public static int Burst_coin(int[] a, int i, int j,int [][] dp) {
		if(i+1==j) {
			return 0;
		}
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		// TODO Auto-generated method stub
		int ans=Integer.MIN_VALUE;
		for(int k=i+1;k<j;k++) {
			int left=Burst_coin(a,i,k,dp);
			int right=Burst_coin(a,k,j,dp); 
			int self=a[i]*a[j]*a[k];
			ans=Math.max(ans, left+right+self);
		}
		return dp[i][j]=ans;
	}

}