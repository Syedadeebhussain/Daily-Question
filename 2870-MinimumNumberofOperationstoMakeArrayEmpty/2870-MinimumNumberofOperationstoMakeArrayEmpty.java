// Last updated: 10/10/2025, 9:56:54 am
class Solution {
    public int minOperations(int[] nums) {
    HashMap<Integer,Integer> mp=new HashMap<>();
    for(int i:nums){
        mp.put(i,mp.getOrDefault(i,0)+1);
    }  
       int c=0;
        for(int key:mp.keySet()){
               if(mp.get(key)==1){
                return -1;
               }
               if(mp.get(key)%3==0){
                c+=mp.get(key)/3;
               }
               else{
                c+=mp.get(key)/3+1; // suppose we have a frequency of 10 then if we are doing by 2 then the value of c will be 5 and if we are doing by combination of 2 nd 3 then it will give 4 (fre/3 +1 )
               }
            }
        return c;

        }
    }