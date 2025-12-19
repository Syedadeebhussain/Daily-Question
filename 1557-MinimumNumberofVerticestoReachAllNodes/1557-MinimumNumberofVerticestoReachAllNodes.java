// Last updated: 19/12/2025, 10:22:34 am
1class Solution {
2    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
3        int [] in=new int [n];
4        for(int i=0;i<edges.size();i++){
5            in[edges.get(i).get(1)]++;
6        }
7        List<Integer> ll=new ArrayList<>();
8        for(int i=0;i<n;i++){
9            if(in[i]==0){
10                ll.add(i);
11            }
12        }
13        return ll;
14    }
15}