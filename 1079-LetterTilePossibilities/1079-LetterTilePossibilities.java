// Last updated: 27/1/2026, 12:40:18 pm
1class Solution {
2    int c=0;
3    public int numTilePossibilities(String s) {
4        Solve(s,"");
5        return c;
6    }
7    public void Solve(String s,String ans ){
8        if(ans.length()>0){
9            c++;
10        }
11        for(int i=0;i<s.length();i++){
12            if(!contains(s,s.charAt(i),i+1)){
13            Solve(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i));
14            }
15        }
16    }
17    public boolean contains(String s,char ch,int idx){
18        for(int i=idx;i<s.length();i++){
19            if(ch==s.charAt(i)){
20                return true;
21            }
22        }
23        return  false;
24    }
25}