// Last updated: 23/8/2025, 6:26:30 pm
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> st=new ArrayList<>();
       HashMap<String, Integer> map = new HashMap<>();
       for(String s:words){
        if(map.containsKey(s)){map.put(s,map.get(s)+1);}
        else{map.put(s,1);}
       }
     int c=0;
      PriorityQueue<String> pq = new PriorityQueue<>(
        (a, b) -> map.get(a).equals(map.get(b)) 
                      ? a.compareTo(b)  //if same the arrange using lexicographical order
                      : map.get(b) - map.get(a) // do sorting in descending order
      );
     pq.addAll(map.keySet());
    for(int i=0;i<k;i++){
       st.add(pq.poll());
    }
    return st;
    }
}