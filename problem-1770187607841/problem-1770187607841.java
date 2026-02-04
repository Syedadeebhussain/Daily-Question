// Last updated: 4/2/2026, 12:16:47 pm
1class Trie {
2	class Node{
3    	char ch;
4    	boolean isTerminal;
5    	HashMap<Character,Node> child;
6       public Node(char ch) {
7    	   this.ch=ch;
8    	   child=new HashMap<>();
9       }
10    }
11	private Node root;
12    public Trie() {
13        root=new Node('*');
14    }
15    public void insert(String word) {
16        Node curr=root;
17        for(int i=0;i<word.length();i++) {
18        	char ch=word.charAt(i);
19        	if(curr.child.containsKey(ch)) {
20        		curr=curr.child.get(ch);
21        	}
22        	else {
23        		Node nn=new Node(ch);
24        		curr.child.put(ch,nn);
25        		curr=nn;
26        	}
27        }
28        curr.isTerminal=true;
29    }
30    
31    public boolean search(String word) {
32    	 Node curr=root;
33         for(int i=0;i<word.length();i++) {
34         	char ch=word.charAt(i);
35         	if(curr.child.containsKey(ch)) {
36         		curr=curr.child.get(ch);
37         	}
38         	else {
39         		return false;
40         	}
41         }
42       return curr.isTerminal;
43    }
44    
45    public boolean startsWith(String word) {
46    	Node curr=root;
47        for(int i=0;i<word.length();i++) {
48        	char ch=word.charAt(i);
49        	if(curr.child.containsKey(ch)) {
50        		curr=curr.child.get(ch);
51        	}
52        	else {
53        		return false;
54        	}
55        }
56      return true;
57    }
58}