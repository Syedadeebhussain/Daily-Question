// Last updated: 21/8/2025, 3:42:11 pm
class Solution {
    public int[] numberGame(int[] nums) {
    PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->a-b); 
    for (int x : nums) {
    pq.add(x);
    }
    int i=0;
    int [] arr=new int [nums.length];
    while(!pq.isEmpty()){
        int a=pq.poll();
        int b=pq.poll();
        arr[i++]=b;
        arr[i++]=a;
    }
    return arr;
    }
}