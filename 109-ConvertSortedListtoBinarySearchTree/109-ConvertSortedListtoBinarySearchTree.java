// Last updated: 12/8/2025, 8:37:53 pm
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> ll=new ArrayList<>();
        while(head!=null){
            ll.add(head.val);
            head=head.next;
        }
        return createTree(ll,0,ll.size()-1);
    }
    public TreeNode createTree(List<Integer> nums,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid=(si+ei)/2;
        TreeNode nn=new TreeNode(nums.get(mid));
        nn.left=createTree(nums,si,mid-1);
        nn.right=createTree(nums,mid+1,ei);
        return nn;
        
    }
}