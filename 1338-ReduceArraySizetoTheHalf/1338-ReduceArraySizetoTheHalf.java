// Last updated: 21/8/2025, 11:16:27 pm
class Solution {
    public int minSetSize(int[] arr) {
    Map<Integer,Integer> map=new HashMap<>();
    for(int i:arr){
        map.put(i, map.getOrDefault(i, 0) + 1);
    }
    PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
    pq.addAll(map.values());
    int size=0;
    int c=0;
    while(size<arr.length/2){
        size+=pq.poll();
        c++;
    }
    return c;
    }
}