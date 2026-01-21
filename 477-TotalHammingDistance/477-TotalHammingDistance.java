// Last updated: 21/1/2026, 7:08:57 pm
1// class Solution {
2//     public int totalHammingDistance(int[] nums) {
3//         int sum=0;
4//         for(int i=0;i<nums.length;i++){
5//             for(int j=i+1;j<nums.length;j++){
6//                 sum+=Integer.bitCount(nums[i]^nums[j]);
7//             }
8//         }
9//         return sum;
10//     }
11// }
12class Solution {
13    public int totalHammingDistance(int[] nums) {
14        int sum=0;
15        for(int i=0;i<32;i++){
16            int zero=0;
17            int one=0;
18            for(int num:nums){
19                if(((num>>i)&1)==1){
20                    one++;
21                }
22                else{
23                    zero++;
24                }
25            }
26            sum+=zero*one;
27        }
28        return sum;
29    }
30}