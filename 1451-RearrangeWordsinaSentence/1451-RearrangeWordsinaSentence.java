// Last updated: 23/12/2025, 3:17:15 pm
1class Solution {
2    public String arrangeWords(String text) {
3        String[] words = text.toLowerCase().split(" ");
4        Arrays.sort(words, (a, b) -> a.length() - b.length());
5        StringBuilder ans = new StringBuilder();
6        for (String w : words) {
7            ans.append(w).append(" ");
8        }
9        ans.setCharAt(0, Character.toUpperCase(ans.charAt(0)));
10        return ans.toString().trim();
11    }
12}
13