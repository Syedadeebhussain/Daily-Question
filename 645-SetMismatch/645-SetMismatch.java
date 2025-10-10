// Last updated: 10/10/2025, 9:11:50 am
class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] arr=new int [2];
    HashMap<Integer,Integer> mp=new HashMap<>();
    for(int i:nums){
        mp.put(i,mp.getOrDefault(i,0)+1);
    }
    for(int i=1;i<=nums.length;i++){
   int count = mp.getOrDefault(i, 0);
    if (count == 2) {
        arr[0] = i;
    } else if (count == 0) {
        arr[1] = i;
    }
    }
    return arr;
    }
}