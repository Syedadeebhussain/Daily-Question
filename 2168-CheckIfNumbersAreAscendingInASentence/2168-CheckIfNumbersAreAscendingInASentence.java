// Last updated: 31/7/2025, 2:23:25 pm
class Solution {
    public boolean areNumbersAscending(String s) {
        String[] str = s.split(" ");
        int num = -1;
        
        for (int i = 0; i < str.length; i++) {
            String s1 = str[i];
            if (Character.isDigit(s1.charAt(0))) {
                int num1 = Integer.parseInt(s1);
                if (num1 > num) {
                    num = num1;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
