// Last updated: 19/9/2025, 5:23:07 pm
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       return   createtree(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode createtree(int[]pre,int plo,int phi,int[] in,int ilo ,int ihi){
        if(plo>phi || ilo>ihi){
            return null;
        }
        TreeNode node =new TreeNode(pre[phi]);
        int idx=search(in,ilo,ihi,pre[phi]);
        int ne=idx-ilo;//counting the number of digits 
        node.left=createtree(pre,plo,plo+ne-1,in,ilo,idx-1);
        node.right=createtree(pre,plo+ne,phi-1,in,idx+1,ihi);
        return node;

    }
    public int search(int [] in,int si,int ei,int item)
    {
        for(int i=si;i<=ei;i++){
            if(in[i]==item){
                return i;
            }
        }
        return 0;
    }
}