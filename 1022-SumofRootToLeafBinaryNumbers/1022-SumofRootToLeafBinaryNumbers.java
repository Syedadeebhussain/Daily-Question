// Last updated: 24/2/2026, 3:23:13 pm
1// class Solution {
2//     int s = 0;
3//     public int sumRootToLeaf(TreeNode root) {
4//         solve(root, "");
5//         return s;
6//     }
7//     public void solve(TreeNode root, String path) {
8//         if (root == null) return;
9//         if (root.left == null && root.right == null) {
10//             System.out.println(path);
11//            path+=root.val;
12//             s += Integer.parseInt(path, 2);
13//             return;
14//         }
15//         solve(root.left, path+root.val);
16//         solve(root.right, path+root.val);
17//     }
18// }
19class Solution {
20    int s = 0;
21
22    public int sumRootToLeaf(TreeNode root) {
23        solve(root, 0);
24        return s;
25    }
26    public void solve(TreeNode root, int sum) {
27        if (root == null) return;
28        if (root.left == null && root.right == null) {
29            sum = (sum<<1) + root.val;
30            s += sum;
31            return;
32        }
33        solve(root.left,(sum << 1) + root.val);
34        solve(root.right,(sum << 1) + root.val);
35    }
36}