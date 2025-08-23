// Last updated: 23/8/2025, 6:00:51 pm
class Solution {
    public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq=new  PriorityQueue<>(Collections.reverseOrder());
    for(int st:stones){
        pq.add(st);
    }  
    while(pq.size()>1){
        int a=pq.poll();
        int b=pq.poll();
        if(a!=b){
            pq.add(a-b);
        }
    }
    return pq.isEmpty() ? 0 : pq.peek();
    }
}