// Last updated: 5/1/2026, 11:04:08 am
1class Solution {
2    public List<String> getLongestSubsequence(String[] words, int[] groups) {
3        List<String> ll=new ArrayList<>();
4        ll.add(words[0]);
5        for(int i=1;i<words.length;i++){
6            if(groups[i]!=groups[i-1])
7            ll.add(words[i]);
8        }
9        return ll;
10    }
11}