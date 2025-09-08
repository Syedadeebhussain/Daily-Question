// Last updated: 8/9/2025, 9:06:06 pm
class Solution {
    public int thirdMax(int[] nums) {
   TreeSet<Integer> st = new TreeSet<>();
    for(int i=0;i<nums.length;i++){
        st.add(nums[i]);
    }
    if(st.size()<3){
        return st.last();
    }
    int count=0;
     for (int val : st.descendingSet()) {
            count++;
            if (count == 3) {
                return val; 
            }
        }
    return 0;
    }
}