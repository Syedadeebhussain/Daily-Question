// Last updated: 3/9/2025, 8:44:55 pm
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ll=new ArrayList<>();
         String r = separator+"";
        for(int i=0;i<words.size();i++){
            String s=words.get(i);
            String [] st=s.split("["+r+"]"); //to convert into regex
            for(int j=0;j<st.length;j++){
                if(st[j].length()>0) ll.add(st[j]);
            }
        }
        return ll;
    }
}