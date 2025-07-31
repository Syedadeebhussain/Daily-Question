// Last updated: 31/7/2025, 2:22:56 pm
// class Solution {
//     public int arithmeticTriplets(int[] nums, int diff) {
//        int c=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 for(int k=j+1;k<nums.length;k++){
//                     if (nums[j]-nums[i]== diff && nums[k]-nums[j]==diff){
//                         c++;
//                     }
//                 }
//             }
//         }
//         return c;
//     }
// }
class Solution {
    public int arithmeticTriplets(int[] a, int diff) {
     int count=0;
     for(int i=0;i<a.length;i++)
     {
        for(int j=i+1;j<a.length;j++)
        {
            for(int k=j+1;k<a.length;k++)
            {
                if(a[j]-a[i]==diff && a[k]-a[j]==diff)
                {
                    count++;
                }
            }
        }
     }
     return count;
    }
}