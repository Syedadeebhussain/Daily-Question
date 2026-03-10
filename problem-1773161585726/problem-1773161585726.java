// Last updated: 10/3/2026, 10:23:05 pm
1class Solution {
2    public int minSpeedOnTime(int[] dist, double hour) {
3    int lo=1;
4    int hi=10000000;
5    int ans=-1;
6    while(lo<=hi){
7        int mid=lo+(hi-lo)/2;
8        if(ispossible(dist,hour,mid)){
9            ans=mid;
10            hi=mid-1;
11        }
12        else{
13            lo=mid+1;
14        }
15
16    }
17    return ans;
18    }
19    public boolean ispossible(int []arr,double hr,int mid){
20        double time=0;
21        for(int i=0;i<arr.length-1;i++){
22            time+=Math.ceil((double)arr[i] / mid);
23        }
24        time+=(double)arr[arr.length-1]/mid;
25        return time<=hr;
26    }
27}