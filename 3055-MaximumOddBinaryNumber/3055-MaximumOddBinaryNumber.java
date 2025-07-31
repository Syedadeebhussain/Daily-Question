// Last updated: 31/7/2025, 2:22:08 pm
class Solution {
    public String maximumOddBinaryNumber(String s) {
        int oneCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                oneCount++;
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < oneCount - 1; i++) {
            result.append('1');
        }
        for (int i = 0; i < s.length() - oneCount; i++) {
            result.append('0');
        }

        result.append('1');

        return result.toString();
    }
}