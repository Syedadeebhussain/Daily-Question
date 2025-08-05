// Last updated: 5/8/2025, 2:59:33 pm
class Solution {
    public int countDistinctIntegers(int[] nums) {
    Set<Integer> st=new HashSet<>();
    for(int num:nums){
        int rev=reverse(num);
            st.add(num);
            st.add(rev);
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