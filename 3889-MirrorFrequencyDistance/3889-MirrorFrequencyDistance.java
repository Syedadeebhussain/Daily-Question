// Last updated: 21/4/2026, 11:32:45 pm
1class Solution {
2    public int mirrorFrequency(String s) {
3     int [] freq=new int[26];
4     int [] freq1=new int[10];
5     for(int i=0;i<s.length();i++){
6        char ch=s.charAt(i);
7        if(!Character.isDigit(ch)){
8            freq[ch-'a']++;
9        }
10        else{
11            freq1[ch-'0']++;
12        }
13     } 
14    int res=0;
15    for(int i=0;i<13;i++){
16      int a=freq[i];
17      int id=25-i;
18       res+=Math.abs(a-freq[id]);
19    }
20    for(int i=0;i<5;i++){
21        int a=freq1[i];
22      int id=9-i;
23       res+=Math.abs(a-freq1[id]);
24    }
25    return res;
26    }
27}