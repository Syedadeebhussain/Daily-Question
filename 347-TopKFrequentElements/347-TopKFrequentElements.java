// Last updated: 21/8/2025, 3:04:47 pm
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    int [] arr=new int[k];
    HashMap<Integer, Integer> freq = new HashMap<>(); 
    for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
    }
    int c=0;
     PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> freq.get(b) - freq.get(a));
     pq.addAll(freq.keySet());
     while(!pq.isEmpty()){
        int q=pq.poll();
        if(c<k){
       arr[c]=q;
       c++;
        }
     }
     return arr;
    }
}