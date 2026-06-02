// Last updated: 2/6/2026, 11:19:25 pm
1class Solution {
2    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
3        int min=Integer.MAX_VALUE;
4        for(int i=0;i<landStartTime.length;i++){
5            for(int j=0;j<waterStartTime.length;j++){
6                
7        int sum1=landStartTime[i]+landDuration[i];
8        int  choose1=Math.max(sum1,waterStartTime[j]);
9        int water1= choose1+waterDuration[j];
10
11                
12        int water2=waterStartTime[j]+waterDuration[j];
13        int choose2=Math.max(water2,landStartTime[i]);
14        int sum2=choose2+landDuration[i];
15
16        min=Math.min(min,Math.min(water1,sum2));
17                
18            }
19          
20        }
21        return min;
22    }
23}