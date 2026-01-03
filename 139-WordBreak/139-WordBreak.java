// Last updated: 3/1/2026, 11:21:51 am
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        Boolean[][] dp = new Boolean[s.length()][wordDict.size()];
4        return solve(wordDict, s, 0, 0, dp);
5    }
6    public boolean solve(List<String> wordDict, String s,int i, int start, Boolean[][] dp) {
7        if (start == s.length()) return true;
8        if (i >= wordDict.size()) return false;
9        if (dp[start][i] != null) {
10            return dp[start][i];
11        }
12        String word = wordDict.get(i);
13        int len = word.length();
14        if (start + len <= s.length() && s.substring(start, start + len).equals(word)) {
15            boolean take = solve(wordDict, s, 0, start + len, dp);
16            // i is becoming zero because we have to chaeck for each word again
17            boolean skip = solve(wordDict, s, i + 1, start, dp);
18           return  dp[start][i] = take || skip;
19        } else {
20         return  dp[start][i] = solve(wordDict, s, i + 1, start, dp);
21        }
22    }
23}
24