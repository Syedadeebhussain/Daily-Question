// Last updated: 23/1/2026, 9:54:07 am
1class Solution {
2    List<String> ll;
3    public List<String> validStrings(int n) {
4        ll=new ArrayList<>();
5        Solve(n,"");
6        return ll;
7    }
8    public void Solve(int n,String ans){
9      if(n==0){
10        ll.add(ans);
11        return ;
12      }
13      if(ans.length()>0 && ans.charAt(ans.length()-1)=='0')
14      {
15        Solve(n-1,ans+'1');
16     
17      }
18      else{
19         Solve(n-1,ans+'0');
20      Solve(n-1,ans+'1');
21      }
22      
23    }
24}