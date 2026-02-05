// Last updated: 5/2/2026, 6:47:27 pm
1class Solution {
2    public int[][] kClosest(int[][] arr, int k) {
3       HashMap<Integer,Double> mp=new HashMap<>();
4		for(int i=0;i<arr.length;i++) {
5			int [] a=arr[i];
6			double dis=Math.sqrt(Math.pow(a[0],2)+Math.pow(a[1],2));
7			mp.put(i, dis);
8		}
9	PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> Double.compare(mp.get(a), mp.get(b)));
10		pq.addAll(mp.keySet());
11		int c=0;
12		int [][] ans=new int[k][2];
13		while(!pq.isEmpty()) {
14			int r=pq.poll();
15			if(c<k) {
16				ans[c]=arr[r];
17				c++;
18			}
19			else {
20				break;
21			}
22		}
23		return ans; 
24    }
25}