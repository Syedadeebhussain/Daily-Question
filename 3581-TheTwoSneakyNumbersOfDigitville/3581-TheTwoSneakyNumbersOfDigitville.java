// Last updated: 31/7/2025, 2:21:37 pm
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
          int[] freq = new int[100]; 
          List<Integer> ll=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
           if(freq[i]==2){
            ll.add(i);
           }
        }
        return new int[]{ll.get(0), ll.get(1)};
    }
}