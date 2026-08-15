// Last updated: 15/8/2026, 4:56:32 pm
class Solution {
    public long maximumSubarraySum(int[] nums, int k) 
    {
        HashMap<Integer, Integer> ans = new HashMap<>();
        int L = 0;
        long sum = 0;
        long maxSum = 0;

        for(int R = 0; R < nums.length; R++)
        {
           sum = sum + nums[R];
            ans.put(nums[R], ans.getOrDefault(nums[R],0)+1);

           int windowSize = R - L + 1;
            if(windowSize == k)
            {
                if(ans.size() == k){
                   maxSum = Math.max(maxSum, sum); 
                }

                sum -= nums[L];
                ans.put(nums[L], ans.get(nums[L]) -1);

                if(ans.get(nums[L]) == 0){
                    ans.remove(nums[L]);
                }
                L++;
            }
        }
        return maxSum;
    }
}