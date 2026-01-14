// Last updated: 14/1/2026, 12:43:05 pm
1// class Solution {
2//     public int[] singleNumber(int[] nums) {
3//     int [] arr=new int[2];
4//    Map<Integer,Integer> mp=new HashMap<>();
5//     for(int i=0;i<nums.length;i++){
6//         mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
7//     }
8// int i=0;
9// for(int key:mp.keySet()){
10//     if(mp.get(key)==1){
11//         arr[i++]=key;
12//         if(i==3){
13//             break;
14//         }
15//     }
16// }
17// return arr;
18//     }
19// }
20
21class Solution {
22    public int[] singleNumber(int[] nums) {
23   int xor=0;
24   for(int i=0;i<nums.length;i++){
25    xor=xor^nums[i];
26   } 
27   int mask=(xor&(-1*xor));
28   int a=0;
29   for(int i=0;i<nums.length;i++){
30    if((mask & nums[i])!=0){
31        a=a^nums[i];
32    }
33   }
34   int b=xor^a;
35   return new int[]{a,b};
36   }
37}