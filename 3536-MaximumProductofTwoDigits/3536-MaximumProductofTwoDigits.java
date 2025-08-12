// Last updated: 12/8/2025, 8:58:49 pm
class Solution {
    public int maxProduct(int n) {
       ArrayList<Integer> ll = new ArrayList<>();
        while (n != 0) {
            ll.add(n % 10);
            n /= 10;
        }
        Collections.sort(ll);
        int size = ll.size();
        return ll.get(size - 1) * ll.get(size - 2);
    }
}