// Last updated: 23/8/2025, 12:34:12 pm
class Solution {
    public int findKthLargest(int[] arr, int k) {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    for(int num:arr){
        pq.add(num);
    }
    int p=0;
    while(k-->0){
        p=pq.poll();
    }
    return p;
    }
  
}