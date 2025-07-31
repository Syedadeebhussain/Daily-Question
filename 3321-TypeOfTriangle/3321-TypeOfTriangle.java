// Last updated: 31/7/2025, 2:21:57 pm
class Solution {
    public String triangleType(int[] nums) {
       int a=nums[0];
       int b=nums[1];
       int c=nums[2];
if(a+b>c && b+c >a && c+a>b)
   {
       if(a==b && b==c && c==a)
       {
        return "equilateral";
       }
       else if((a==b ||b==c ||c==a))
       {
        return "isosceles";
       }
       else if(a!=b && b!=c && c!=a )
       {
        return "scalene";
       }
   }
    return "none";
    }
}