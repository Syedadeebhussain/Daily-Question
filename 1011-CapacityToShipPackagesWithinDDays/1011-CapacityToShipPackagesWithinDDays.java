// Last updated: 10/3/2026, 11:14:27 pm
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3    int lo=0;
4    int hi=0;
5    for(int i:weights){
6        hi+=i;
7        lo=Math.max(lo,i);
8    } 
9    int ans=0;   
10    while(lo<=hi){
11        int mid=lo+(hi-lo)/2;
12        if(ispossible(weights,days,mid)){
13            ans=mid;
14            hi=mid-1;
15        }
16        else{
17            lo=mid+1;
18        }
19    }
20    return ans;
21    }
22    public boolean ispossible(int [] arr,int day,int mid){
23        int sum=0;
24        int c=0;
25        for(int i:arr){
26            if(sum+i<=mid){
27             sum+=i;
28            }
29            else{
30                c++;
31                sum=i;
32            
33            }
34            if(c+1>day) return false;
35        }
36
37      return true;
38    }
39}