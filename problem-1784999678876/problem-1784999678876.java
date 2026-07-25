// Last updated: 25/7/2026, 10:44:38 pm
1class Solution {
2    public int maxProduct(int n) {
3       ArrayList<Integer> ll = new ArrayList<>();
4        while (n != 0) {
5            ll.add(n % 10);
6            n /= 10;
7        }
8        Collections.sort(ll);
9        int size = ll.size();
10        return ll.get(size - 1) * ll.get(size - 2);
11    }
12}