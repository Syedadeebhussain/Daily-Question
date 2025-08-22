// Last updated: 22/8/2025, 11:18:18 am
class Solution {
    public int minStoneSum(int[] piles, int k) {
     PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
     for(int i=0;i<piles.length;i++){
        pq.add(piles[i]);
     }  
     while(k-->0){
        int p=pq.poll();
        p=p-p/2;
        pq.add(p);
     }
      int s=0;
      while(!pq.isEmpty()){
        s+=pq.poll();
      }
      return s;
    }
}