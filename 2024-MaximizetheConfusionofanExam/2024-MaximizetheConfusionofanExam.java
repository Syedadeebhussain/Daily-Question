// Last updated: 14/8/2026, 5:09:37 pm
1class Solution {
2    public int maxConsecutiveAnswers(String s, int k) {
3     int ei=0;
4     int si=0;
5     int ans=0;
6     int tr=0;
7     int tf=0;
8     int max=0;
9     while(ei<s.length()){
10        if(s.charAt(ei)=='T') tr++;
11        else tf++;
12        max=Math.max(tr,Math.max(tf,max));
13        while((ei-si+1)-max>k){
14          if(s.charAt(si)=='T') tr--;
15        else tf--;
16        si++;  
17        }
18        ans=Math.max(ans,ei-si+1);
19        ei++;
20     }   
21     return ans;
22    }
23}