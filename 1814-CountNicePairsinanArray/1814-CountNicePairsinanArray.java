// Last updated: 25/12/2025, 7:37:24 pm
1class Solution {
2    public int countNicePairs(int[] nums) {
3        long mod=1000000007;
4        Map<Integer,Long>map=new HashMap<>();
5        long ans=0;
6        for(int num:nums){
7            int k=num-rev(num);
8            long c=map.getOrDefault(k,0l);
9            ans=(ans+c)%mod;
10            map.put(k,c+1);
11        }
12        return (int)ans;
13    }
14    public int rev(int num){
15        int r=0;
16        while(num>0)
17        {
18            r=r*10+(num%10);
19            num/=10;
20        }
21        return r;
22    }
23}