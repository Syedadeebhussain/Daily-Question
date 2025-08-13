// Last updated: 13/8/2025, 11:33:21 am
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
    int camera=0;
    public int minCameraCover(TreeNode root) {
      int c=minCamera(root);
      if(c==-1){
        camera++;
      }

      return camera;
    }
    public int minCamera(TreeNode root){
           if(root==null){
            return 0;
           }
           int left=minCamera(root.left);
           int  right=minCamera(root.right);
           if(left==-1 || right==-1){ // is root ke child ko camera ki need hai
            camera++;
            return 1; //camera setup kara is node pe
           }
          else  if(left==1 || right==1){ // inme se kisi ek ke pass camerqa hai ya dono ke pass  or ek ke pass camera hai or doosra covered hai 
            return 0;
            } //iska matlab mai covered hu           }
           else {
            return -1;//need a camera
           }
    }
    }
