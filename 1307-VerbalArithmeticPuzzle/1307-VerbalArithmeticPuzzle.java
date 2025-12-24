// Last updated: 24/12/2025, 11:19:27 pm
1class Solution {
2    int[] placeValue = {1, 10, 100, 1000, 10000, 100000, 1000000};
3    public boolean isSolvable(String[] words, String result) {
4        Set<Character> Set = new HashSet<>();
5        int[] weight = new int[128];
6        boolean[] leadingChar = new boolean[128];
7        for (String w : words) {
8            char[] arr = w.toCharArray();
9            int len = arr.length;
10            for (int i = 0; i < len; i++) {
11                char c = arr[i];
12                if (i == 0 && len > 1)
13                    leadingChar[c] = true;
14                Set.add(c);
15                weight[c] += placeValue[len - i - 1];
16            }
17        }
18        char[] arr = result.toCharArray();
19        int rLen = arr.length;
20        for (int i = 0; i < rLen; i++) {
21            char c = arr[i];
22            if (i == 0 && rLen > 1)
23                leadingChar[c] = true;
24        Set.add(c);
25            weight[c] -= placeValue[rLen - i - 1];
26        }
27        char[] letters = new char[Set.size()];
28        int p = 0;
29        for (char c : Set)
30            letters[p++] = c;
31        boolean[] digitUsed = new boolean[10];
32        return solve(letters, weight, leadingChar, digitUsed, 0, 0);
33    }
34
35    public boolean solve(char[] letters,int[] weight,boolean[] leadingChar,boolean[] digitUsed,int index,int sum) {
36        if (index == letters.length)
37            return sum == 0;
38        char ch = letters[index];
39        for (int d = 0; d <= 9; d++) {
40            if (digitUsed[d]) continue;
41            if (d == 0 && leadingChar[ch]) continue;
42            digitUsed[d] = true;
43if (solve(letters,weight,leadingChar,digitUsed,index + 1,sum + weight[ch] * d))
44                return true;
45            digitUsed[d] = false;
46        }
47        return false;
48    }
49}
50