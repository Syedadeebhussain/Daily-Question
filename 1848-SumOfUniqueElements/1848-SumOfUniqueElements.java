// Last updated: 31/7/2025, 2:24:07 pm
class Solution {
    public int sumOfUnique(int[] nums) {
      int [] fre=new int[101];
      for(int i=0;i<nums.length;i++){
        fre[nums[i]]++;
      }  
      int sum=0;
      for(int i=0;i<101;i++){
        if(fre[i]==1){
            sum+=i;
        }
      }
      return sum;
    }
}