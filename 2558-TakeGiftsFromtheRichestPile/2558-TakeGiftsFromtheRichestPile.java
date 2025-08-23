// Last updated: 23/8/2025, 7:09:24 am
class Solution {
    public long pickGifts(int[] gifts, int k) {
    PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder()); 
    for(long gift:gifts){
        pq.add(gift);
    }
    long s=0;
    while(k-->0){
        long item=pq.poll();
       long sqrt=(long)Math.sqrt(item);
       pq.add(sqrt);
    }   
    while(!pq.isEmpty()){
        s+=pq.poll();
    }
    return s;
    }
}