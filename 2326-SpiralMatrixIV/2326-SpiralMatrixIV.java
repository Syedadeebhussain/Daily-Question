// Last updated: 13/2/2026, 12:27:13 am
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public int[][] spiralMatrix(int m, int n, ListNode head) {
13        int [][] arr=new int[m][n];
14        for(int [] a:arr){
15            Arrays.fill(a,-1);
16        }
17        int minc=0;
18        int maxc=n-1;
19        int minr=0;
20        int maxr=m-1;
21        while(head!=null){
22            for(int i=minc;i<=maxc && head!=null;i++){
23               arr[minr][i]=head.val;
24               head=head.next;
25            }
26            minr++;
27            for(int i=minr;i<=maxr && head!=null;i++){
28                arr[i][maxc]=head.val;
29                head=head.next;
30            }
31            maxc--;
32            for(int i=maxc;i>=minc && head!=null;i--){
33                arr[maxr][i]=head.val;
34                head=head.next;
35            }
36            maxr--;
37            for(int i=maxr;i>=minr && head!=null;i--){
38                arr[i][minc]=head.val;
39                head=head.next;
40            }
41            minc++;
42        }
43        return arr;
44    }
45}