// Last updated: 4/8/2026, 6:46:13 pm
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        int max=Integer.MIN_VALUE;
5        List<Integer>ll=new ArrayList<>();
6        Set<Integer> st=new HashSet<>();
7        for(int i=0;i<nums.length;i++){
8            min=Math.min(min,nums[i]);
9            max=Math.max(max,nums[i]);
10            st.add(nums[i]);
11        }
12        for(int i=min;i<=max;i++){
13            if(!st.contains(i)){
14                ll.add(i);
15            }
16        }
17       return ll;
18    }
19}