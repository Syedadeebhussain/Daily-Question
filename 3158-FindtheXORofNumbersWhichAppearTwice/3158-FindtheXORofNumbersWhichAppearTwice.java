// Last updated: 10/10/2025, 9:16:57 am
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
     HashMap<Integer,Integer> mp=new HashMap<>();
    for(int i:nums){
        mp.put(i,mp.getOrDefault(i,0)+1);
    } 
    int s=0;
    for(int key :mp.keySet()){
        if(mp.get(key)==2){
          s^=key;
        }
    }
    return s;
    }
}