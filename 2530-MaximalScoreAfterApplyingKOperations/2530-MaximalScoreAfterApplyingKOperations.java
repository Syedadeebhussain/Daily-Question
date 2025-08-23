// Last updated: 23/8/2025, 7:16:32 am
class Solution {
    public long maxKelements(int[] nums, int k) {
         PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (long num :nums) {
            pq.add(num);
        }
        long s=0;
        while(k-->0){
            long item=pq.poll();
            s+=item;
            item=(long)Math.ceil(item/3.0);
            pq.add(item);
        }
        return s;
    }
}