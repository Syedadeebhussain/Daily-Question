// Last updated: 15/1/2026, 12:45:59 am
1class Solution {
2    public boolean canReach(int[] arr, int start) {
3    Queue<Integer>q=new LinkedList<>();
4    q.add(start);
5   boolean visited[]=new boolean[arr.length];
6    visited[start]=true;
7    while(!q.isEmpty()){
8        int idx=q.poll();
9        if(arr[idx]==0) return true;
10        int forward=idx+arr[idx];
11        if(forward<arr.length && !visited[forward]){
12              visited[forward]=true;
13              q.add(forward);  
14        }
15        int backward=idx-arr[idx];
16        if(backward>=0 && !visited[backward]){
17              visited[backward]=true;
18              q.add(backward) ; 
19        }
20    }
21    return false;
22    }
23
24}