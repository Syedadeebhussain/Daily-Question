// Last updated: 31/7/2025, 2:24:04 pm
class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) return false; // can't have 2 in base-3
            n /= 3;
        }
        return true;
    }
}
