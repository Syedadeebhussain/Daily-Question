// Last updated: 31/7/2025, 2:24:46 pm
class Solution {
    public int findNumbers(int[] nums) {
        int s=0;
       for(int i=0;i<nums.length;i++)
       {
         int x=nums[i];
         int r,c=0;
         while(x>0)
         {
          r=x%10;
          ++c ;
          x=x/10; 
         }
        
         if(c%2==0)
         {
            s++;
         }
       } 
       return s;
       
    }
}