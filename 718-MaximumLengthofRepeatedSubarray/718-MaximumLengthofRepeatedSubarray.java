// Last updated: 13/10/2025, 8:01:43 pm
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
//         int [][] dp=new int [nums1.length+1][nums2.length+1];
//         for(int[] i:dp){
//             Arrays.fill(i,-1);
//         }
//         find(nums1,nums2,nums1.length,nums2.length,dp);
//         return dp[nums1.length][nums2.length];
//     }
//     public int find(int[] nums1, int[] nums2,int i,int j,int [][] dp){
//         if(i==0||j==0){
//             return 0;
//         }
//         if(dp[i][j]!=-1){
//             return dp[i][j];
//         }
//         if(nums1[i-1]==nums2[j-1]){
//             return dp[i][j]=1+find(nums1,nums2,i-1,j-1,dp);
//         }
//         else{
//             return dp[i][j]=0;
//         }
//     }
// }
       int n = nums1.length;
        int m = nums2.length;
        int[][] dp = new int[n + 1][m + 1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 ||j==0){
                    dp[i][j]=0;
                }
            }
        }
        int maxLen=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    maxLen = Math.max(maxLen, dp[i][j]); //because we are making it zero in next step
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return maxLen;
    }
}