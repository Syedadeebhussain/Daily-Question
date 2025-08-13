// Last updated: 13/8/2025, 9:39:53 am
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return  createTree(nums,0,nums.length-1);
    }
    public int max(int [] nums,int si,int ei){
        int max1=Integer.MIN_VALUE;
        int id=-1;
        for(int i=si;i<=ei;i++){
            if(nums[i]>=max1){
                max1=Math.max(max1,nums[i]);
                id=i;
            }
            
        }
        return id; 
    }
       public TreeNode createTree(int [] nums,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid=max(nums,si,ei);
        TreeNode nn=new TreeNode(nums[mid]);
        nn.left=createTree(nums,si,mid-1);
        nn.right=createTree(nums,mid+1,ei);
        return nn;
    }
}