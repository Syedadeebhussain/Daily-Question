// Last updated: 7/9/2025, 8:57:18 am
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