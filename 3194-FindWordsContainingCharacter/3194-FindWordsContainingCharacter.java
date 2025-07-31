// Last updated: 31/7/2025, 2:22:03 pm
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            if(words[i].indexOf(x)!=-1){
                ll.add(i);
            }
        }
        return ll;
    }
}