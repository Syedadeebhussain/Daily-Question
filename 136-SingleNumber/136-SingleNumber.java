// Last updated: 9/10/2025, 10:07:46 am
class Solution {
    public int singleNumber(int[] nums) {
    Map<Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
    }
PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->mp.get(a)-mp.get(b));
    pq.addAll(mp.keySet());
    return pq.poll();
    }
}