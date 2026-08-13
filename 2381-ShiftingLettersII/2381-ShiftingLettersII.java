// Last updated: 13/8/2026, 10:54:09 am
1class Solution {
2    public String shiftingLetters(String s, int[][] shifts) {
3     int []  freq=new int[s.length()+1];
4     for(int [] arr:shifts){
5        int  start=arr[0];
6        int  end=arr[1];
7        int dir=arr[2];
8        if(dir==1){
9            freq[start]+=1;
10            freq[end+1]-=1;
11        }
12        else{
13            freq[start]-=1;
14                freq[end+1]+=1;
15        }
16
17     }
18      StringBuilder sb=new StringBuilder();
19      int shift=0;
20     for(int i=0;i<s.length();i++){
21        shift+=freq[i];
22        int pos = s.charAt(i)-'a';
23        pos=((pos+shift)%26+26)%26;
24        sb.append((char)(pos+'a'));
25     }
26     return  sb.toString();
27    }
28}