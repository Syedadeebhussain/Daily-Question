// Last updated: 31/10/2025, 8:24:19 am
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