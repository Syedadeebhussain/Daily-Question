// Last updated: 31/7/2025, 2:25:45 pm
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int match=0;
        int i=0,j=0;
        while(i<g.length && j<s.length){
                   if(g[i]<=s[j]){
                        match++;
                        i++;
                        j++;
                     }
                     else{
                        j++;
                     }
        }
        return match;
    }
}