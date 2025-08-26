// Last updated: 26/8/2025, 3:43:12 pm
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
      Map<Integer,Integer> mp=new HashMap<>();
      for(int i=0;i<mat.length;i++){
        int s=0;
        for(int j=0;j<mat[0].length;j++){
            if(mat[i][j]==1){
                s+=1;
            }
        }
        mp.put(i,s);
      } 
      PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> mp.get(a).equals(mp.get(b)) ? a - b : mp.get(a) - mp.get(b));
      pq.addAll(mp.keySet());
      int [] arr=new int[k];
      for(int i=0;i<k;i++){
        int c=pq.poll();
        arr[i]=c;
      }
      return arr;
    }
}