// Last updated: 19/12/2025, 7:21:02 pm
1class Solution {
2    public String longestWord(String[] words) {
3     Set<String> set = new HashSet<>();
4    for (String num : words) {
5        set.add(num);
6    }
7    String ans="";
8     for(String word:words){
9        if(found(word,set)){
10            if(word.length()>ans.length() || (word.length()==ans.length() && word.compareTo(ans)<0)){
11                ans=word;
12            }
13        }
14     }
15     return ans; 
16    }
17    public boolean found(String s,Set<String> set){
18        for(int i=1;i<s.length();i++){
19            if(!set.contains(s.substring(0,i))){
20                return false;
21            }
22        }
23        return true;
24    }
25}