// Last updated: 1/1/2026, 12:03:12 pm
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3      int totalcost=0;
4      for(int i=0;i<gas.length;i++){
5        totalcost+=gas[i]-cost[i];
6      }  
7      if(totalcost<0) return -1;
8      int total=0;
9      int curr=0;
10      for(int i=0;i<gas.length;i++){
11        total+=gas[i]-cost[i];
12        if(total<0){
13            curr=i+1;
14            total=0;
15        }
16      }  
17      return curr;
18      
19     }
20}