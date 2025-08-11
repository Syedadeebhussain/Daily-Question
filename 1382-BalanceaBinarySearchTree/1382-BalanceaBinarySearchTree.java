// Last updated: 11/8/2025, 2:38:15 pm
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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        find(root, ll);
       return createTree(ll,0,ll.size()-1);
    }

    private void find(TreeNode root, List<Integer> ll) {
        if (root == null) {
            return;
        }
        find(root.left, ll);
        ll.add(root.val);
        find(root.right, ll);
    }

    public TreeNode createTree(List<Integer> ll,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid=(si+ei)/2;
        TreeNode nn=new TreeNode(ll.get(mid));
        nn.left=createTree(ll,si,mid-1);
        nn.right=createTree(ll,mid+1,ei);
        return nn;
        
    }
}