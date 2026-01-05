// Last updated: 5/1/2026, 12:27:40 pm
1class Solution {
2    public int longestStrChain(String[] words) {
3        Arrays.sort(words,(a,b)->a.length()-b.length());
4        int [] dp=new int[words.length];
5        Arrays.fill(dp,1);
6        for(int i=1;i<words.length;i++){
7            for(int j=0;j<i;j++){
8                if(ischain(words[i],words[j])){
9                    dp[i]=Math.max(dp[i],dp[j]+1);
10                }
11            }
12        }
13        int max=1;
14        for(int i:dp){
15            max=Math.max(i,max);
16        }
17      return max;
18    }
19    public boolean ischain(String s,String t){
20        if(s.length()!=t.length()+1) return false;
21        int i=0;
22        int j=0;
23        int c=0; // for checking how many variables we have skipped
24        while(i<s.length() && j<t.length()){
25            if(s.charAt(i)==t.charAt(j)){
26                i++;
27                j++;
28            }
29            else{
30                if(c>=1) return false;
31                c++;
32                i++;
33            }
34        }
35        return true;
36    }
37}