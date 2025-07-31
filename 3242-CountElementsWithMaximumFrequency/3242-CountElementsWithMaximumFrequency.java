// Last updated: 31/7/2025, 2:21:58 pm
class Solution {
    public int maxFrequencyElements(int[] nums) {
      int [] fre=new int[101];
       for(int i=0;i<nums.length;i++){
         fre[nums[i]]++;
      }  
      int sum=0;
      int min=fre[0];
      for(int i=0;i<101;i++){
        if(fre[i]>=min){
            min=fre[i];
        }
      }
      for(int i=0;i<101;i++){
        if(fre[i]==min){
            sum+=min;
        }
      }
      return sum;  
    }
}