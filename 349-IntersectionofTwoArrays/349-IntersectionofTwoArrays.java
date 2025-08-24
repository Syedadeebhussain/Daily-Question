// Last updated: 24/8/2025, 9:10:43 am
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ll = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num2 : nums2) {
            if (map.containsKey(num2) && map.get(num2) > 0) {
                ll.add(num2);
                map.put(num2, map.get(num2) - 1);
            }
        }
        Set<Integer> st = new HashSet<>(ll);
        int[] ans = new int[st.size()];
        int i = 0;
        for (int num : st) {
            ans[i++] = num;
        }

        return ans;
    }
}
