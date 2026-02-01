// Last updated: 1/2/2026, 9:52:54 pm
1class Solution {
2    public String shiftingLetters(String s, int[] shifts) {
3       long sum=0;
4       for(int i:shifts){
5        sum+=i;
6       } 
7       char [] arr=new char[s.length()];
8       for(int i=0;i<s.length();i++){
9        int ch=s.charAt(i)-'a';
10        char new_ch=(char)((ch+sum)%26+'a');
11        arr[i]=new_ch;
12        sum-=shifts[i];
13       }
14       StringBuilder sb=new StringBuilder();
15       for(char i:arr){
16        sb.append(i);
17       }
18       return sb.toString();
19    }
20}