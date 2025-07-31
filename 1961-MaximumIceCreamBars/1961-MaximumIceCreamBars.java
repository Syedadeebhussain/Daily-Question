// Last updated: 31/7/2025, 2:23:49 pm
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        int i = 0;
        while (i < costs.length && coins >= costs[i]) {
            coins -= costs[i];
            count++;
            i++;
        }
        return count;
    }
}
