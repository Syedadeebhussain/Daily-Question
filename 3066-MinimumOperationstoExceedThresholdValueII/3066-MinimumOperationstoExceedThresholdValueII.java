// Last updated: 1/9/2025, 10:15:54 pm
class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add((long)num);
        }

        int c = 0;
        while (!pq.isEmpty() && pq.peek() < k) {
            long min1 = pq.poll();
            long min2 = pq.poll();

          
            long combined = min1 *2+ min2;  

            pq.add(combined);
            c++;
        }
        return c;
    }
}
