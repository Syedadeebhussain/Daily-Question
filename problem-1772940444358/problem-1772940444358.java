// Last updated: 8/3/2026, 8:57:24 am
1class Solution {
2    public int smallestBalancedIndex(int[] nums) {
3    int n=nums.length;
4    long [] sum=new long[n+1];
5     sum[0]=0;
6     for(int i=1;i<=n;i++){
7         sum[i]=sum[i-1]+nums[i-1];
8     }
9     long [] pro=new long[n+1];
10     Arrays.fill(pro,1);
11        long limit=(long)1e14;
12     for(int i=n-1;i>=0;i--){
13         if(pro[i+1]>limit/nums[i]){
14             pro[i]=limit+1;
15         }
16         else{
17         pro[i]=pro[i+1]*nums[i];
18         }
19     }
20     for(int i=0;i<n;i++){
21         long s=sum[i];
22         long p=pro[i+1];
23         if(s==p)
24         {
25            return i;
26         }
27         }
28        return -1;
29    }
30}