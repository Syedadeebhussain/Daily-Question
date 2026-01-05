// Last updated: 5/1/2026, 3:29:59 pm
1// class Solution {
2//     public int minimumMountainRemovals(int[] nums) {
3//         int n=nums.length ;
4//         if (n< 3) return 0;
5//         int [] lis=LIS(nums);
6//         int [] lds=LDS(nums);
7//         int ans =0;
8//         for(int i=0;i<n;i++){
9//             if(lis[i]>1 && lds[i]>1)
10//             {
11//             ans=Math.max(ans,lis[i]+lds[i]-1);
12//             }
13//         }
14//         return n-ans;
15//     }
16//     public int [] LIS(int [] arr){
17//        int n=arr.length;
18//         int [] dp=new int[n];
19//         Arrays.fill(dp,1);
20//         for(int i=1;i<n;i++){
21//             for(int j=i-1;j>=0;j--){
22//                 if(arr[i]>arr[j]){
23//                     dp[i]=Math.max(dp[i],dp[j]+1);
24//                 }
25//             }
26//         }
27//         return dp;
28//     }
29//     public int[] LDS(int [] arr){
30//         int n=arr.length;
31//         int [] dp=new int[n];
32//         Arrays.fill(dp,1);
33//         for(int i=n-2;i>=0;i++){
34//             for(int j=i+1;j<n;j++){
35//                 if(arr[i]>arr[j]){
36//                     dp[i]=Math.max(dp[i],dp[j]+1);
37//                 }
38//             }
39//         }
40//         return dp;
41//     }
42// }
43import java.util.Arrays;
44
45class Solution {
46
47    public int minimumMountainRemovals(int[] nums) {
48        int n = nums.length;
49        if (n < 3) return 0;
50
51        int[] lis = LIS(nums);
52        int[] lds = LDS(nums);
53
54        int best = 0;
55        for (int i = 0; i < n; i++) {
56            if (lis[i] > 1 && lds[i] > 1) {
57                best = Math.max(best, lis[i] + lds[i] - 1);
58            }
59        }
60        return n - best;
61    }
62
63    public int[] LIS(int[] arr) {
64        int n = arr.length;
65        int[] dp = new int[n];
66        Arrays.fill(dp, 1);
67
68        for (int i = 1; i < n; i++) {
69            for (int j = i - 1; j >= 0; j--) {
70                if (arr[i] > arr[j]) {
71                    dp[i] = Math.max(dp[i], dp[j] + 1);
72                }
73            }
74        }
75        return dp;
76    }
77
78    public int[] LDS(int[] arr) {
79        int n = arr.length;
80        int[] dp = new int[n];
81        Arrays.fill(dp, 1);
82
83        for (int i = n - 2; i >= 0; i--) {
84            for (int j = i + 1; j < n; j++) {
85                if (arr[i] > arr[j]) {
86                    dp[i] = Math.max(dp[i], dp[j] + 1);
87                }
88            }
89        }
90        return dp;
91    }
92}
93