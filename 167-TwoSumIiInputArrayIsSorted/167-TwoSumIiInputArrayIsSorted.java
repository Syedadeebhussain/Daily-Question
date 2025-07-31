// Last updated: 31/7/2025, 2:26:34 pm
class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int lo=0;
    int hi=numbers.length-1;
    while(lo<=hi)
    {
        int total=numbers[lo]+numbers[hi];
        if(total==target)
        {
            return new int[]{lo+1,hi+1};
        }
        else if(total<target)
        {
            lo++;
        }
        else
        {
            hi--;
        }
    }
    return new int []{-1,-1};
    }
}