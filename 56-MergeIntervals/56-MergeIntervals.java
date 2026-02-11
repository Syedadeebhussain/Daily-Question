// Last updated: 11/2/2026, 1:04:22 pm
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
4        List<int[]> ll=new ArrayList<>();
5        ll.add(intervals[0]);
6        for(int i=1;i<intervals.length;i++){
7            int [] last=ll.get(ll.size()-1);
8            if(last[1]>=intervals[i][0]){
9                last[1]=Math.max(last[1],intervals[i][1]);
10            }
11            else{
12                ll.add(intervals[i]);
13            }
14        }
15        return ll.toArray(new int [ll.size()][]);
16    }
17}