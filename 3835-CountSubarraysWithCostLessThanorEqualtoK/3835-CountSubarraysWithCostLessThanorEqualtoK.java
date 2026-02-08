// Last updated: 8/2/2026, 8:02:27 pm
1class Solution {
2    public long countSubarrays(int[] nums, long k) {
3    int ei=0;
4    int si=0;
5    long ans=0;
6    Deque<Integer> maxD = new ArrayDeque<>();//to store max
7    Deque<Integer> minD = new ArrayDeque<>();// to store min
8    while(ei<nums.length){
9        while(!maxD.isEmpty() && nums[maxD.peekLast()]<=nums[ei]){
10            maxD.pollLast();
11        }
12        maxD.addLast(ei);
13        while(!minD.isEmpty() && nums[minD.peekLast()]>=nums[ei]){
14            minD.pollLast();
15        }
16        minD.addLast(ei);
17        while((long)(nums[maxD.peekFirst()]-nums[minD.peekFirst()])*(ei-si+1)>k){
18             if (maxD.peekFirst() == si) maxD.pollFirst();
19                if (minD.peekFirst() == si) minD.pollFirst();
20              si++;
21        }
22        ans+=(ei-si+1);
23        ei++;
24    }    
25    return ans;
26    }
27}