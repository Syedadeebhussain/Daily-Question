// Last updated: 31/7/2025, 2:27:04 pm
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
         if (root == null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
        List<Integer> currentLevel = new ArrayList<>();
        int levelSize = q.size();
for (int i = 0; i < levelSize; i++) 
{
          TreeNode rv=q.remove();
         currentLevel.add(rv.val);
           if(rv.left!=null){
           q.add(rv.left);
            }
             if(rv.right!=null){
                q.add(rv.right);
            }
            
}
ans.add(currentLevel);
        
        }
         return ans;

    }
 
}