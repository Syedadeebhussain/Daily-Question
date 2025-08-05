// Last updated: 5/8/2025, 2:58:08 pm
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                
        int sum1=landStartTime[i]+landDuration[i];
        int  choose1=Math.max(sum1,waterStartTime[j]);
        int water1= choose1+waterDuration[j];

                
        int water2=waterStartTime[j]+waterDuration[j];
        int choose2=Math.max(water2,landStartTime[i]);
        int sum2=choose2+landDuration[i];

        min=Math.min(min,Math.min(water1,sum2));
                
            }
          
        }
        return min;
    }
}