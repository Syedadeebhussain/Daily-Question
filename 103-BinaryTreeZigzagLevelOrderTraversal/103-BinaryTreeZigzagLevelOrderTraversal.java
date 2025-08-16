// Last updated: 16/8/2025, 10:59:34 am
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int c=1;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ll=new ArrayList<>();
           find(root,ll);
           return ll;
        }
         public List<List<Integer>> find(TreeNode root,List<List<Integer>> ll) {
        if (root == null) return ll;

            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                int levelSize = q.size();
                ArrayList<Integer> st = new ArrayList<>();

                for (int i = 0; i < levelSize; i++) {
                    TreeNode r = q.remove();
                    st.add(r.val);
                    if (r.left != null) {
						q.add(r.left);
					}
                    if (r.right != null) {
						q.add(r.right);
					}
                }
				if(c%2==0){
					Collections.reverse(st);
				}
				c++;
                ll.add(st);
            }
            return ll;
}}