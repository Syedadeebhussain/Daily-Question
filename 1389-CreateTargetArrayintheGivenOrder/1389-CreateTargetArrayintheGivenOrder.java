// Last updated: 16/10/2025, 10:08:54 pm
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
      int [] target=new int [nums.length];
      List<Integer> ll=new ArrayList<>();
      for(int i=0;i<nums.length;i++){
        ll.add(index[i],nums[i]);
      } 
      for(int i=0;i<nums.length;i++){
        target[i]=ll.get(i);
      }
      return target;
    }
}