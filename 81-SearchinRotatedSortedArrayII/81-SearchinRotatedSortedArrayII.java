// Last updated: 7/3/2026, 1:10:50 am
1class Solution {
2    public boolean search(int[] num, int target) {
3        LinkedHashSet<Integer> set = new LinkedHashSet<>();
4        for(int i:num){
5            set.add(i);
6        }
7        List<Integer> nums = new ArrayList<>(set);
8        int lo = 0;
9        int hi = nums.size() - 1;
10        while(lo <= hi){
11    int mid = lo + (hi - lo) / 2;
12    if(nums.get(mid) == target)
13        return true;
14    if(nums.get(lo) <= nums.get(mid)){
15        if(nums.get(lo) <= target && target < nums.get(mid)){
16            hi=mid-1;
17        }
18        else{
19            lo=mid+1;
20        }
21    }
22    else{
23        if(nums.get(mid)<target && target <= nums.get(hi)){
24            lo=mid+1;
25        }
26        else{
27            hi=mid-1;
28        }
29    }
30}
31return false;
32   }
33}