// Last updated: 27/1/2026, 2:42:53 pm
1class Solution {
2    public TreeNode bstFromPreorder(int[] preorder) {
3        return createTree(preorder, 0, preorder.length - 1);
4    }
5    public TreeNode createTree(int[] pre, int plo, int phi) {
6        if (plo > phi) return null;
7        TreeNode node = new TreeNode(pre[plo]);
8        int idx = find(plo + 1, pre, phi, pre[plo]);
9        if (idx == -1) {// no larger element
10            node.left = createTree(pre, plo + 1, phi);
11            node.right = null;
12        } else {
13            node.left = createTree(pre, plo + 1, idx - 1);
14            node.right = createTree(pre, idx, phi);
15        }
16        return node;
17    }
18    public int find(int si, int[] pre, int ei, int item) {
19        for (int i = si; i <= ei; i++) {
20            if (pre[i] > item) {
21                return i;
22            }
23        }
24        return -1;
25    }
26}
27