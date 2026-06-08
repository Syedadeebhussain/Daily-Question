// Last updated: 8/6/2026, 11:13:34 pm
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3       List<Integer> ans1=new ArrayList<>();
4        List<Integer> ans2=new ArrayList<>();
5         List<Integer> ans3=new ArrayList<>();
6        for(int i=0;i<nums.length;i++){
7            if(nums[i]<pivot){
8                ans1.add(nums[i]);
9            }
10            else if(nums[i]==pivot){
11                ans3.add(nums[i]);
12            }
13            else{
14                ans2.add(nums[i]);
15            }
16        }
17    //    Collections.sort(ans1, Collections.reverseOrder());
18        // Collections.sort(ans2);
19        ans1.addAll(ans3);
20        ans1.addAll(ans2);
21         int[] array = new int[ans1.size()];
22        for (int i = 0; i < ans1.size(); i++) {
23            array[i] = ans1.get(i);
24        }
25        return array;
26    }
27}