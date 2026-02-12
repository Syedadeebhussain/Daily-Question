// Last updated: 12/2/2026, 12:08:09 pm
1class Solution {
2    public int[] maximizeXor(int[] arr, int[][] queries) {
3     int [][] q=new int[queries.length][3];
4    for(int i=0;i<q.length;i++) {
5    	q[i][0]=queries[i][0];
6    	q[i][1]=queries[i][1];
7    	q[i][2]=i;
8    }
9    Arrays.sort(q,(a,b)->a[1]-b[1]);
10    Arrays.sort(arr);
11    int [] ans=new int[q.length];
12    Trie t=new Trie();
13    int j=0;
14    for(int [] a:q) {
15    	while(j<arr.length && arr[j]<=a[1]) {
16    		t.add(arr[j]);
17    		j++;
18    	}
19    	if(j==0) { 
20    		ans[a[2]]=-1;
21    	}
22    	else {
23    		ans[a[2]]=t.getMaxXor(a[0]);
24    	}
25    }
26    return ans;
27}
28    static class Trie {
29		class Node {
30			Node zero;
31			Node one;
32
33		}
34
35		private Node root = new Node();
36
37		public void add(int val) {
38			Node curr = root;
39			for (int i = 31; i >= 0; i--) {
40				int bit = val & (1 << i);
41				if (bit == 0) {
42					if (curr.zero != null) {
43						curr = curr.zero;
44					} else {
45						Node nn = new Node();
46						curr.zero = nn;
47						curr = nn;
48					}
49				} else {
50					if (curr.one != null) {
51						curr = curr.one;
52					} else {
53						Node nn = new Node();
54						curr.one = nn;
55						curr = nn;
56					}
57				}
58
59			}
60		}
61
62		public int getMaxXor(int x) {
63			int ans = 0;
64			Node curr = root;
65			for (int i = 31; i >= 0; i--) {
66				int bit = x & (1 << i);
67				if (bit == 0) {
68					if (curr.one != null) {
69						ans = ans | (1 << i);
70						curr = curr.one;
71					} else {
72						curr = curr.zero;
73					}
74
75				} else {
76					if (curr.zero != null) {
77						ans = ans | (1 << i);
78						curr = curr.zero;
79					} else {
80						curr = curr.one;
81					}
82				}
83			}
84			return ans;
85		}
86
87	}
88}