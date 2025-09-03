// Last updated: 3/9/2025, 9:08:30 pm
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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        find(root,ll);
        Collections.sort(ll);
        TreeNode root1=new TreeNode(ll.get(0));
         TreeNode dummy=root1;
        for(int i=1;i<ll.size();i++){
            root1.right=new TreeNode(ll.get(i));
            root1=root1.right;
        }
        return dummy;
    }
    public void find(TreeNode root,List<Integer> ll){
        if(root==null){
            return ;
        }
        ll.add(root.val);
        find(root.left,ll);
        find(root.right,ll);
    }
}