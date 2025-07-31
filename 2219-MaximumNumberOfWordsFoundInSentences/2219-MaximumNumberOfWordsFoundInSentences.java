// Last updated: 31/7/2025, 2:23:22 pm
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            int m=find(sentences[i]);
            max=Math.max(max,m);
        }
        return max;
    }
    public int find(String s){
        int c=0;
        s=s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                c++;
            }
        }
        c++;
        return c; 
    }
}