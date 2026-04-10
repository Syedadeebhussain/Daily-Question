// Last updated: 10/4/2026, 10:15:41 pm
1class Solution {
2    public int minimumDistance(int[] nums) {
3        Map<Integer,List<Integer>> mp=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            if(!mp.containsKey(nums[i])){
6                mp.put(nums[i],new ArrayList<>());
7            }
8            mp.get(nums[i]).add(i);
9        }
10        int min=Integer.MAX_VALUE;
11        for(List<Integer> ll:mp.values()){
12            if(ll.size()<3){
13                continue;
14            }
15            for(int i=0;i+2<ll.size();i++){
16                int d=2*(ll.get(i+2)-ll.get(i));
17                min=Math.min(d,min);
18            }
19        }
20        return min!=Integer.MAX_VALUE?min:-1;
21    }
22}