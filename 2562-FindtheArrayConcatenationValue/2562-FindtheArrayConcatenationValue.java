// Last updated: 3/8/2025, 9:07:21 am
class Solution {
    public long findTheArrayConcVal(int[] nums) {
      int left=0;
      int right=nums.length-1 ;
      long sum=0;
      
      while(left<=right){
        if(left==right){
sum += nums[left];
        }
        else{
String s = nums[left] + "" + nums[right];
        
        sum+=Integer.parseInt(s);
        }
       left++;
        right--;
      }
      return sum;

    }
}