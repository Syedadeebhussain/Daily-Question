// Last updated: 5/8/2025, 2:59:20 pm
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