// Last updated: 30/12/2025, 10:48:17 am
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3      Map<Integer,Integer> mp=new HashMap<>();
4      for(int i=1;i<=n;i++){
5        mp.put(i,0);
6      }
7      for(int i=0;i<trust.length;i++){
8        int a=trust[i][0];
9        int b=trust[i][1];
10      mp.put(a,mp.get(a)-1);
11        mp.put(b,mp.get(b)+1);
12
13      }
14     for(int map:mp.keySet()){
15        if(mp.get(map)==n-1){
16            return map;
17        }
18     }
19     return -1;
20    }
21}