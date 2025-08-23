// Last updated: 23/8/2025, 6:38:24 pm
class Solution {
    public int[] frequencySort(int[] nums) {
    int [] arr=new int[nums.length];
    HashMap<Integer, Integer> freq = new HashMap<>(); 
    for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
    }
    int c=0;
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> freq.get(a).equals(freq.get(b)) ? b - a : freq.get(a) - freq.get(b));//if frequency is same then sort based in descending order else based on frequency
     pq.addAll(freq.keySet());
     while(!pq.isEmpty()){
        int q=pq.poll();
        int count=freq.get(q);
        for(int i=0;i<count;i++){
           arr[c]=q;
           c++;
        }
     }
     return arr;
    }
}