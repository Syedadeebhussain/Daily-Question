// Last updated: 13/8/2025, 6:44:28 pm
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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        find(root,ll);
        int min=differ(ll);
        return min;
    }
    public void find(TreeNode root,List<Integer> ll){
        if(root==null){
            return;
        }
        find(root.left,ll);
        ll.add(root.val);
        find(root.right,ll);
    }
    public int differ(List<Integer> ll){
        int min=Integer.MAX_VALUE;
        for(int i=1;i<ll.size();i++){
            int diff=Math.abs(ll.get(i)-ll.get(i-1));
            min=Math.min(min,diff);
        }
        return min;
    }
}