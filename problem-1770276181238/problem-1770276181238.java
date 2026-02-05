// Last updated: 5/2/2026, 12:53:01 pm
1import java.util.*;
2
3class Solution {
4    List<String> ll;
5    public List<String> findWords(char[][] maze, String[] words) {
6        ll = new ArrayList<>();
7        Trie t = new Trie();
8        for (String s : words) {
9            t.insert(s);
10        }
11        for (int i = 0; i < maze.length; i++) {
12            for (int j = 0; j < maze[0].length; j++) {
13                if (t.root.child.containsKey(maze[i][j])) {
14                    t.Search(maze, i, j, t.root, ll);
15                }
16            }
17        }
18        return ll;
19    }
20    static class Trie {
21        class Node {
22            char ch;
23            String isTerminal;
24            HashMap<Character, Node> child;
25            public Node(char ch) {
26                this.ch = ch;
27                child = new HashMap<>();
28            }
29        }
30        private Node root = new Node('*');
31        public void insert(String word) {
32            Node curr = root;
33            for (int i = 0; i < word.length(); i++) {
34                char ch = word.charAt(i);
35                if (curr.child.containsKey(ch)) {
36                    curr = curr.child.get(ch);
37                } else {
38                    Node nn = new Node(ch);
39                    curr.child.put(ch, nn);
40                    curr = nn;
41                }
42            }
43            curr.isTerminal = word;
44        }
45        public void Search(char[][] maze, int i, int j, Node node, List<String> ll) {
46
47            if (i < 0 || j < 0 || i >= maze.length || j >= maze[0].length
48                    || !node.child.containsKey(maze[i][j])) {
49                return;
50            }
51            char ch = maze[i][j];
52            node = node.child.get(ch);
53            if (node.isTerminal != null) {
54                ll.add(node.isTerminal);
55                node.isTerminal = null;
56            }
57            maze[i][j] = '*';
58            Search(maze, i + 1, j, node, ll);
59            Search(maze, i - 1, j, node, ll);
60            Search(maze, i, j + 1, node, ll);
61            Search(maze, i, j - 1, node, ll);
62            maze[i][j] = ch;
63        }
64    }
65}
66