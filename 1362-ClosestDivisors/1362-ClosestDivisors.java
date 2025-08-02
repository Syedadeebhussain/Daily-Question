// Last updated: 2/8/2025, 1:05:08 pm
class Solution {
    public int[] closestDivisors(int num) {
        int[] res1 = findClosestPair(num + 1);
        int[] res2 = findClosestPair(num + 2);
        
        int diff1 = Math.abs(res1[0] - res1[1]);
        int diff2 = Math.abs(res2[0] - res2[1]);

        return diff1 <= diff2 ? res1 : res2;
    }

    private int[] findClosestPair(int target) {
        int sqrt = (int)Math.sqrt(target);
        for (int i = sqrt; i >= 1; i--) {
            if (target % i == 0) {
                return new int[]{i, target / i};
            }
        }
        return new int[]{1, target}; 
    }
}
