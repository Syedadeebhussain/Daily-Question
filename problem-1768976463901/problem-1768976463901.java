// Last updated: 21/1/2026, 11:51:03 am
1class Solution {
2    public int xorAllNums(int[] nums1, int[] nums2) {
3      int n=nums1.length;
4      int m=nums2.length;
5      if(n%2==0 && m%2==0) return 0;
6      int xor1=Bitwise(nums1);
7      int xor2=Bitwise(nums2);
8      if(n%2==1 && m%2==1){
9        return xor1^xor2;
10      }  
11      else if(n%2==1){
12        return xor2;
13      }
14      else{
15        return xor1;
16      }
17    }
18
19    public static int Bitwise(int [] arr){
20        int xor=0;
21        for(int v:arr){
22            xor^=v;
23        }
24        return xor;
25    }
26}
27