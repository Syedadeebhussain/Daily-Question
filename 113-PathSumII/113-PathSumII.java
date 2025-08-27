// Last updated: 27/8/2025, 7:55:11 pm
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      List<List<Integer>> ans=new ArrayList<>();
         List<Integer> ll=new ArrayList<>();
         print(root,targetSum,ans,ll);
         return ans;
    }

    public void print(TreeNode root,int amt,List<List<Integer>> ans, List<Integer> ll){
             if(root==null){
                return ;
             }
             ll.add(root.val);
             if(root.left==null && root.right==null && amt==root.val){
                    ans.add(new ArrayList<>(ll));
             }
             else
             {
               print(root.left,amt-root.val,ans,ll);
              print(root.right,amt-root.val,ans,ll);
             }
              ll.remove(ll.size()-1);
            
    }
}