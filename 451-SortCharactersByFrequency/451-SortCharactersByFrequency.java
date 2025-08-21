// Last updated: 21/8/2025, 2:55:40 pm
import java.util.*;

class Solution {
    public String frequencySort(String s) {
        
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
      
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> freq.get(b) - freq.get(a)
        );

        pq.addAll(freq.keySet());

        StringBuilder st = new StringBuilder();
        while (!pq.isEmpty()) {
            char ch = pq.poll();
            int count = freq.get(ch);
            for (int i = 0; i < count; i++) {
                st.append(ch);
            }
        }

        return st.toString();
    }
}