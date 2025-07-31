// Last updated: 31/7/2025, 9:45:22 pm
class Solution {
    public int countDistinctIntegers(int[] nums) {
    Set<Integer> st=new HashSet<>();
    for(int i=0;i<nums.length;i++){
        int rev=reverse(nums[i]);
        if(!st.contains(nums[i])){
            st.add(nums[i]);
        }
        if(!st.contains(rev)){
            st.add(rev);
        }
    }  
    return st.size();  
    }
    public int reverse(int number){
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10; 
            reverse = reverse * 10 + digit; 
            number /= 10; 
        }
        return reverse;
    }
}