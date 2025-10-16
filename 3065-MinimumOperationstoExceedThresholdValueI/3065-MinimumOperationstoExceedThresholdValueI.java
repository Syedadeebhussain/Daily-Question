// Last updated: 16/10/2025, 10:00:28 pm
class Solution {
    public int minOperations(int[] nums, int k) {
      PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->a-b);
      for(int i:nums){
        pq.add(i);
      }  
      int c=0;
      while(!pq.isEmpty()){
         int r=pq.poll();
          if(r<k)
          { 
            c++;
          }
          else{
            break;
          }

      }
      return c;
    }
}