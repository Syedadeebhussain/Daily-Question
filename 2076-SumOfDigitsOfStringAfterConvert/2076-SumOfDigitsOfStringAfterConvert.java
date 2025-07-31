// Last updated: 31/7/2025, 2:23:38 pm
class Solution {
    public int getLucky(String s, int k) {
        int n = sum(s); 
        for (int i = 1; i < k; i++) {
            n = digitSum(n);
        }
        return n;
    }
        public int sum(String s) {
        StringBuilder st = new StringBuilder();        
        for (int i = 0; i < s.length(); i++) {
            st.append(s.charAt(i) - 'a' + 1);
        }
        int total = 0;
        for (int i = 0; i < st.length(); i++) {
            total += st.charAt(i) - '0';
        }

        return total;
    }

    
    public int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
