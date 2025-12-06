// Last updated: 6/12/2025, 10:27:31 pm
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3     Map<Character, Integer> freq = new HashMap<>();
4    for (char c : text.toCharArray()) {
5        freq.put(c, freq.getOrDefault(c, 0) + 1);
6    }
7    int b = freq.getOrDefault('b', 0);
8    int a = freq.getOrDefault('a', 0);
9    int l = freq.getOrDefault('l', 0) / 2;
10    int o = freq.getOrDefault('o', 0) / 2;
11    int n = freq.getOrDefault('n', 0);
12    return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);   
13    }
14}