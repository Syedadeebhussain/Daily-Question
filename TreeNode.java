
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
class Solution {
  TreeNode successorNode=null;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        Successor(root,p);
       return null;
    }
    public TreeNode Successor(TreeNode root, TreeNode p){
      if(root == null) return null;
      if(root.val>p.val){
        successorNode=root;
       Successor(root.left,p);
      }
      else{
        Successor(root.right,p);
      }
      return successorNode;
    }
}