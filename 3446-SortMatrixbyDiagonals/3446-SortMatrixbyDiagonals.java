// Last updated: 24/1/2026, 5:31:01 pm
1class Solution {
2    public int[][] sortMatrix(int[][] mat) {
3        Map<Integer,List<Integer>> mp=new HashMap<>();
4     for(int i=0;i<mat.length;i++){
5        for(int j=0;j<mat[0].length;j++){
6            if(!mp.containsKey(i-j)){
7            mp.put(i-j,new ArrayList<>());
8            }
9           mp.get(i-j).add(mat[i][j]);
10        }
11     }
12     for(int key:mp.keySet()){
13        List<Integer> ll=mp.get(key);
14        if(key<0){
15            Collections.sort(ll);
16        }
17        else{
18           Collections.sort(ll, Collections.reverseOrder());
19        }
20     }
21     for(int i=0;i<mat.length;i++){
22        for(int j=0;j<mat[0].length;j++){
23            int key=i-j;
24            mat[i][j]=mp.get(key).remove(0);
25        }
26     }
27     return mat;
28    }
29}