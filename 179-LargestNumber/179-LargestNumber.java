// Last updated: 31/1/2026, 10:20:05 pm
class Solution {
    public String largestNumber(int[] nums) {
        
        String[] arr=new String[nums.length];
        for(int i=0;i<nums.length;i++) arr[i]=String.valueOf(nums[i]);

        //sort it

        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));

        if(arr[0].charAt(0)=='0') return "0";

        StringBuilder sb=new StringBuilder();
        for(String each:arr){
            sb.append(each);
        }

        return sb.toString();
    }
}