// Last updated: 31/7/2025, 2:22:35 pm
class Solution {
    public long repairCars(int[] ranks, int cars) {
    long lo=1;
   long hi=0;
   for(int i=0;i<ranks.length;i++){
    hi=Math.max(ranks[i],hi);
   }
   hi=hi*cars*cars;
    long ans=0;
    while(lo<=hi)
    {
        long mid=lo+(hi-lo)/2;
        if(ispossible(ranks,cars,mid))
        {
            ans=mid;
            hi=mid-1;
        }
        else
        {
            lo=mid+1;
        }
    }
    return ans;
    }
    public static boolean ispossible(int[] ranks,int cars,long mid)
    {
        long sum=0;
        for(int i=0;i<ranks.length;i++)
        {
            sum+=(long)Math.sqrt((double)mid/ranks[i]);
             if(sum>=cars){
            return true;
        }
        }
        if(sum>=cars){
            return true;
        }
        return false;

    }
}