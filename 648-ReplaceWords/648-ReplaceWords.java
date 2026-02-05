// Last updated: 5/2/2026, 12:15:54 pm
1import java.util.*;
2
3class Solution {
4    public String replaceWords(List<String> Dictionary, String sentence) {
5        Trie t = new Trie();
6
7        for (String s : Dictionary) {
8            t.insert(s);
9        }
10
11        String[] arr = sentence.split(" ");
12        StringBuilder sb = new StringBuilder();
13
14        for (int i = 0; i < arr.length; i++) {
15            String get = t.search(arr[i]);
16            sb.append(get+" ");
17        }
18
19        return sb.toString().trim();
20    }
21
22    static class Trie {
23        class Node {
24            char ch;
25            String isTerminal;
26            HashMap<Character, Node> child;
27            public Node(char ch) {
28                this.ch = ch;
29                child = new HashMap<>();
30            }
31        }
32        private Node root = new Node('*');
33        public void insert(String word) {
34            Node curr = root;
35            for (int i = 0; i < word.length(); i++) {
36                char ch = word.charAt(i);
37                if (curr.child.containsKey(ch)) {
38                    curr = curr.child.get(ch);
39                } else {
40                    Node nn = new Node(ch);
41                    curr.child.put(ch, nn);
42                    curr = nn;
43                }
44            }
45            curr.isTerminal = word;
46        }
47        public String search(String word) {
48            Node curr = root;
49            for (int i = 0; i < word.length(); i++) {
50                char ch = word.charAt(i);
51                if (curr.child.containsKey(ch)) {
52                    curr = curr.child.get(ch);
53                    if (curr.isTerminal != null) {
54                        return curr.isTerminal;
55                    }
56
57                } else {
58                    return word;
59                }
60            }
61
62            return word;
63        }
64    }
65}
66