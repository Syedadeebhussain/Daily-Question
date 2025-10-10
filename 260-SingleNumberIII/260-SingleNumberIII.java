// Last updated: 10/10/2025, 9:02:16 am
class Solution {
    public int[] singleNumber(int[] nums) {
    int [] arr=new int[2];
   Map<Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
    }
int i=0;
for(int key:mp.keySet()){
    if(mp.get(key)==1){
        arr[i++]=key;
        if(i==3){
            break;
        }
    }
}
return arr;
    }
}