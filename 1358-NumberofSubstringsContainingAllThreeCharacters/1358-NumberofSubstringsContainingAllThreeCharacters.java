// Last updated: 30/6/2026, 11:00:23 pm
1class Solution {
2    public int numberOfSubstrings(String s) {
3    int si=0;
4    int ei=0;
5    int [] freq=new int[3];
6    int ans=0;
7    while(ei<s.length())
8    {
9         char ch=s.charAt(ei);
10         freq[ch-'a']++;
11         while(freq[0]>0 && freq[1]>0 && freq[2]>0){
12         ans+=s.length()-ei;
13         freq[s.charAt(si)-'a']--;
14         si++;
15        }
16        ei++;
17    }
18    return ans;
19    }
20}