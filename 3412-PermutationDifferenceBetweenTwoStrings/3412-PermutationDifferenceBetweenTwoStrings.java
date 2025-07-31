// Last updated: 31/7/2025, 2:21:48 pm
class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=t.indexOf(ch);
            sum+=Math.abs(i-index);
        }
        return sum;
    }
}