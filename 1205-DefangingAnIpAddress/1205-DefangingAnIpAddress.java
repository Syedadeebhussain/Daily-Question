// Last updated: 31/7/2025, 2:24:58 pm
class Solution {
    public String defangIPaddr(String s) {
        s=s.replace(".","[.]");
        return s;
    }
}