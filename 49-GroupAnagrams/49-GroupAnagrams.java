// Last updated: 31/7/2025, 2:27:37 pm
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ll = new ArrayList<>();
        int n = strs.length;
        boolean[] visited = new boolean[n]; 

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue; 

            List<String> ll1 = new ArrayList<>();
            ll1.add(strs[i]); 
            visited[i] = true;

            for (int j = i + 1; j < n; j++) {
                if (!visited[j] && isAnagram(strs[i], strs[j])) {
                    ll1.add(strs[j]);
                    visited[j] = true; 
                }
            }
            ll.add(ll1);
        }
        return ll;
    }  

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
