// Last updated: 24/8/2026, 6:23:18 pm
1class Solution {
2    public int countCompleteSubarrays(int[] nums) {
3    Set<Integer> st=new HashSet<>();
4    HashMap<Integer,Integer> mp=new HashMap<>();
5    for(int i:nums){
6        st.add(i);
7    }  
8    int k=st.size();
9    int ei=0;
10    int si=0;
11    int ans=0;
12    while(ei<nums.length){
13        mp.put(nums[ei],mp.getOrDefault(nums[ei],0)+1);
14        while(mp.size() == k){
15            ans += nums.length - ei;
16           mp.put(nums[si],mp.get(nums[si])-1);
17           if(mp.get(nums[si])==0) {
18            mp.remove(nums[si]);
19           } 
20           si++;
21        }
22        ei++;
23    }
24    return ans;
25    }
26}