// Last updated: 9/9/2025, 3:53:31 pm
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        
        TreeSet<Integer> st = new TreeSet<>();
        TreeSet<Integer> st1 = new TreeSet<>();
        
        for (int x : nums1) st.add(x);
        for (int x : nums2) st1.add(x);

        List<Integer> ll = new ArrayList<>();
        List<Integer> ll1 = new ArrayList<>();

        for (int val : st) {
            if (!st1.contains(val)) {
                ll.add(val);
            }
        }
        for (int val : st1) {
            if (!st.contains(val)) {
                ll1.add(val);
            }
        }

        ans.add(ll);
        ans.add(ll1);
        return ans;
    }
}
