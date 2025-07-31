// Last updated: 31/7/2025, 2:22:09 pm
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String str="";
        for(int i=0;i<words.size();i++){
            str+=words.get(i).charAt(0);
        }
       return s.equals(str);
    }
}