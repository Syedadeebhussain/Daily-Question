// Last updated: 20/1/2026, 10:58:47 pm
1class Solution {
2    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
3        Set<Integer> s1=new HashSet<>();
4        Set<Integer> s2=new HashSet<>();
5        Set<Integer> s3=new HashSet<>();
6        for(int i:nums1){
7            s1.add(i);
8        }
9        for(int i:nums2){
10            s2.add(i);
11        }
12        for(int i:nums3){
13            s3.add(i);
14        }
15        Map<Integer,Integer> map=new HashMap<>();
16        for(int i:s1){
17            map.put(i,map.getOrDefault(i,0)+1);
18        }
19        for(int i:s2){
20            map.put(i,map.getOrDefault(i,0)+1);
21        }
22        for(int i:s3){
23            map.put(i,map.getOrDefault(i,0)+1);
24        }
25        List<Integer> res=new ArrayList<>();
26        for(int i:map.keySet()){
27            if(map.get(i)>=2){
28                res.add(i);
29            }
30        }
31        return res;
32    }
33}