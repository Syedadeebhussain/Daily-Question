// Last updated: 30/12/2025, 11:14:17 am
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3    List<List<Integer>> ll=new ArrayList<>();
4    for(int i=0;i<isConnected.length;i++){
5        ll.add(new ArrayList<>());
6    }  
7    for(int i=0;i<isConnected.length;i++){
8        for(int j=0;j<isConnected.length;j++){
9            if(isConnected[i][j]==1){
10                ll.get(i).add(j);
11            }
12        }
13    }
14    HashSet<Integer> visited=new HashSet<>();
15    Queue<Integer> q=new LinkedList<>();
16    int c=0;
17    for(int i=0;i<isConnected.length;i++){
18        if(visited.contains(i)) continue;
19        q.add(i);
20        c++;
21        while(!q.isEmpty()){
22            int r=q.poll();
23            if(visited.contains(r)) continue;
24            visited.add(r);
25            for(int nbrs:ll.get(r)){
26                if(nbrs!=r && !visited.contains(nbrs)){
27                    q.add(nbrs);
28                }
29            }
30        }
31    }
32    return c;
33    }
34}