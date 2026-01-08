// Last updated: 8/1/2026, 1:01:06 pm
1// class Solution {
2//     public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
3//         Set<String> st = new HashSet<>(wordList);
4//         List<List<String>> ans = new ArrayList<>();
5//         Queue<List<String>> q = new LinkedList<>();
6//         List<String> start = new ArrayList<>();
7//         start.add(beginWord);
8//         q.add(start);
9//         int level = 0;
10//         List<String> usedOnLevel = new ArrayList<>();
11//         while (!q.isEmpty()) {
12//             List<String> path = q.poll();
13//             if (path.size() > level) {
14//                 level++;
15//                 for (String s : usedOnLevel) {
16//                     st.remove(s);
17//                 }
18//                 usedOnLevel.clear();
19//             }
20//             String word = path.get(path.size() - 1);
21//             if (word.equals(endWord)) {
22//                 if (ans.size() == 0) {
23//                     ans.add(new ArrayList<>(path));
24//                 } else if (ans.get(0).size() == path.size()) {
25//                     ans.add(new ArrayList<>(path));
26//                 }
27//             }
28
29//             for (int i = 0; i < word.length(); i++) {
30//                 char[] arr = word.toCharArray();
31//                 for (char ch = 'a'; ch <= 'z'; ch++) {
32//                     arr[i] = ch;
33//                     String next = new String(arr);
34
35//                     if (st.contains(next)) {
36//                         List<String> newPath = new ArrayList<>(path);
37//                         newPath.add(next);
38//                         q.add(newPath);
39//                         usedOnLevel.add(next);
40//                     }
41//                 }
42//             }
43//         }
44//         return ans;
45//     }
46// }
47class Solution {
48
49    String begin;
50    HashMap<String, Integer> distMap;
51    List<List<String>> ans;
52    private void dfs(String word, List<String> seq) {
53        if (word.equals(begin)) {
54            List<String> temp = new ArrayList<>(seq);
55            Collections.reverse(temp);
56            ans.add(temp);
57            return;
58        }
59
60        int steps = distMap.get(word);
61        char[] arr = word.toCharArray();
62
63        for (int i = 0; i < arr.length; i++) {
64            char original = arr[i];
65            for (char ch = 'a'; ch <= 'z'; ch++) {
66                arr[i] = ch;
67                String prev = new String(arr);
68
69                if (distMap.containsKey(prev) && distMap.get(prev) + 1 == steps) {
70                    seq.add(prev);
71                    dfs(prev, seq);
72                    seq.remove(seq.size() - 1);
73                }
74            }
75            arr[i] = original;
76        }
77    }
78
79    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
80        ans = new ArrayList<>();
81        distMap = new HashMap<>();
82        begin = beginWord;
83
84        Set<String> set = new HashSet<>(wordList);
85        if (!set.contains(endWord)) return ans;
86
87        Queue<String> q = new LinkedList<>();
88        q.add(beginWord);
89        distMap.put(beginWord, 1);
90        set.remove(beginWord);
91
92        int len = beginWord.length();
93        while (!q.isEmpty()) {
94            String word = q.poll();
95            int steps = distMap.get(word);
96
97            if (word.equals(endWord)) break;
98
99            char[] arr = word.toCharArray();
100            for (int i = 0; i < len; i++) {
101                char original = arr[i];
102                for (char ch = 'a'; ch <= 'z'; ch++) {
103                    arr[i] = ch;
104                    String next = new String(arr);
105
106                    if (set.contains(next)) {
107                        q.add(next);
108                        set.remove(next);
109                        distMap.put(next, steps + 1);
110                    }
111                }
112                arr[i] = original;
113            }
114        }
115        if (distMap.containsKey(endWord)) {
116            List<String> seq = new ArrayList<>();
117            seq.add(endWord);
118            dfs(endWord, seq);
119        }
120
121        return ans;
122    }
123}