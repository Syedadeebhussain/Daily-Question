// Last updated: 8/1/2026, 11:58:49 am
1class Solution {
2    class Pair{
3        String word;
4        int step;
5        public Pair(String word,int step){
6            this.word=word;
7            this.step=step;
8        }
9    }
10    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
11        Set<String> st=new HashSet<>();
12        for(String s:wordList){
13            st.add(s);
14        }
15        Queue<Pair> q=new LinkedList<>();
16        q.add(new Pair(beginWord,1));
17        st.remove(beginWord);
18        while(!q.isEmpty()){
19            Pair rm=q.poll();
20            int step=rm.step;
21            String word=rm.word;
22            if(word.equals(endWord)) return step;
23            for(int i=0;i<word.length();i++){
24                for(char ch='a' ;ch<='z';ch++){
25                    char[] replace_arr=word.toCharArray();
26                    replace_arr[i]=ch;
27                    String replace_word=new String(replace_arr);
28                    if(st.contains(replace_word)){
29                        st.remove(replace_word);
30                        q.add(new Pair(replace_word,step+1));
31                    }
32                }
33            }
34        }
35        return 0; 
36        
37    }
38}