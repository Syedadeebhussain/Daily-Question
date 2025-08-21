// Last updated: 21/8/2025, 3:35:01 pm
class Solution {
    public int mostFrequentEven(int[] nums) {
    HashMap<Integer, Integer> freq = new HashMap<>(); 
    for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
    }
    int c=0;
    int fre=0;
    int ans=-1;
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> freq.get(b) - freq.get(a));
     pq.addAll(freq.keySet());
     while(!pq.isEmpty()){
        int q=pq.poll();
        if(q%2==0)
        {
            int count=freq.get(q);
            if(count >fre || (count == fre && q<ans)){
                ans=q;
                fre=count;
            }
        }
     }
     return ans;
    }
}