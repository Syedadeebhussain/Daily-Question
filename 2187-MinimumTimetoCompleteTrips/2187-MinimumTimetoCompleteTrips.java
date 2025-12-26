// Last updated: 26/12/2025, 6:25:20 pm
1class Solution {
2    public long minimumTime(int[] time, int totalTrips) {
3      long lo=1;
4      int min=Integer.MAX_VALUE;
5      for(int t:time){
6        min=Math.min(t,min);
7      }
8      long hi=(long)min*totalTrips;
9      long ans=0;
10      while(lo<=hi){
11        long mid=lo+(hi-lo)/2;
12        if(ispossible(mid,time,totalTrips)){
13            ans=mid;
14            hi=mid-1;
15        }
16        else{
17            lo=mid+1;
18        }
19      }
20     return ans;
21    }
22    public boolean ispossible(long mid,int [] time,int k){
23        long trip=0;
24        // how many trip one bus can complete in mid time
25        for(int i=0;i<time.length;i++){
26            trip+=mid/time[i];
27        }
28        return trip>=k;
29    }
30}