// Last updated: 16/7/2026, 9:25:57 am
class Solution {
    Map<String,Integer> dp=new HashMap<>();
    public long gcdSum(int[] nums) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++) {
            max=Math.max(max,nums[i]);
            nums[i]=gcd(max,nums[i]);
        }
        Arrays.sort(nums);
        long sum=0;
        int l=0,r=nums.length-1;
        while(l<r) {
            sum+=gcd(nums[l++],nums[r--]);
        }
        return sum;
    }

    int gcd(int b, int s) {
        return b%s==0?s:gcd(s,b%s);
    }
}