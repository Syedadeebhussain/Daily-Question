// Last updated: 11/2/2026, 12:55:53 pm
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        int idx = BinarySearch(intervals, newInterval);
4        List<int[]> ll = new ArrayList<>();
5        for(int i=0;i<idx;i++){
6            ll.add(intervals[i]);
7        }
8       if(!ll.isEmpty() && ll.get(ll.size()-1)[1]>=newInterval[0]){
9        ll.get(ll.size()-1)[1]=Math.max(ll.get(ll.size()-1)[1],newInterval[1]);
10       }
11       else{
12       ll.add(newInterval);  
13      }
14      for(int i=idx;i<intervals.length;i++){
15        int [] last=ll.get(ll.size()-1);
16        if(intervals[i][0]<=last[1]){
17            last[1]=Math.max(last[1],intervals[i][1]);
18        }
19        else{
20            ll.add(intervals[i]);
21        }
22      }
23      return ll.toArray(new int[ll.size()][]);
24
25    }
26    public int BinarySearch(int[][] intervals, int[] newInterval){
27        int lo = 0;
28        int hi = intervals.length - 1;
29        int ans = intervals.length;
30        while(lo <= hi){
31            int mid = lo + (hi - lo) / 2;
32            if(intervals[mid][0] > newInterval[0]){
33                ans = mid;
34                hi = mid - 1;
35            } else {
36                lo = mid + 1;
37            }
38        }
39        return ans;
40    }
41}
42