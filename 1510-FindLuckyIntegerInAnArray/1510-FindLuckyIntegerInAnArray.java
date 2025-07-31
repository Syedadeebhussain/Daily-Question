// Last updated: 31/7/2025, 2:24:37 pm
class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];  
        for (int num : arr) {
            freq[num]++;
        }

        
        for (int i = 500; i >= 1; i--) {
            if (freq[i] == i) {
                return i;
            }
        }

        return -1;  
    }
}
