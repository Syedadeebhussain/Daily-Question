// Last updated: 31/7/2025, 2:26:27 pm
class Solution {
    public int countPrimes(int n) {
    if(n<=2)
    {
        return 0;
    }
    return PrimeSieve(n);
    }
    public static int PrimeSieve(int n) {
	int [] ans=new int [n];
	ans[0]=ans[1]=1;
	for(int i=2;i*i<=ans.length;i++) {
		if(ans[i]==0) // i prime hai
		{
			
			for(int j=2;i*j <ans.length;j++)
				//2*2
			{
				ans[i*j]=1;
			}
		}
			
	}
	int c=0;
	for(int i=2;i<ans.length;i++)
	{
		if(ans[i]==0)
		{
			c++;
		}
	}
	return c;
	
}
}
