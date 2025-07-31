// Last updated: 31/7/2025, 2:26:50 pm
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    return Complete(gas,cost);
    }
     public static int Complete(int [] gas,int[] cost)
{
	int total=0;
	for(int i=0;i<cost.length;i++)
	{
		total+=gas[i]-cost[i];
	}
	if(total<0)
	{
		return -1;
	}
	int idx=0;
	int curr=0;
	for(int i=0;i<cost.length;i++)
	{
		curr+=gas[i]-cost[i];
		if(curr<0)
		{
			curr=0;
			idx=i+1;
		}
	}
	return idx;
}
}
