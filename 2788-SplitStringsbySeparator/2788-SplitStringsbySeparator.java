// Last updated: 3/9/2025, 8:45:55 pm
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res=new ArrayList<>();
        String sep="\\" + separator;
        for(String word : words){
            String parts[]=word.split(sep);
            for(String p : parts){
                if(!p.isEmpty()){
                    res.add(p);
                }
            }
        }
        return res;
    }
}