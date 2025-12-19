// Last updated: 19/12/2025, 11:21:57 pm
1class Solution {
2    public boolean isPossible(int[] nums) {
3      Map<Integer,Integer> mp=new HashMap<>();
4      for(int num:nums){
5        mp.put(num,mp.getOrDefault(num,0)+1);
6      }  
7      Map<Integer,Integer> vacancy=new HashMap<>();
8      for(int num:nums){
9        if(mp.get(num)<=0) continue;
10        if(vacancy.getOrDefault(num,0)>0){ // agar kisi ko iski need hai
11        mp.put(num,mp.getOrDefault(num,0)-1);
12         vacancy.put(num,vacancy.getOrDefault(num,0)-1);
13         vacancy.put(num+1,vacancy.getOrDefault(num+1,0)+1);
14        }
15         else if (mp.getOrDefault(num + 1, 0) > 0 && mp.getOrDefault(num + 2, 0) > 0) {
16                mp.put(num , mp.get(num) - 1);
17                mp.put(num + 1, mp.get(num + 1) - 1);
18                mp.put(num + 2, mp.get(num + 2) - 1);
19                vacancy.put(num + 3, vacancy.getOrDefault(num + 3, 0) + 1);// aage chalke isko iski need padh sakti hai
20            }
21            else{
22                return false;
23            }
24        }
25        return true;
26      }
27    }
28