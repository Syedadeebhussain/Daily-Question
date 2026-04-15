// Last updated: 16/4/2026, 12:18:25 am
1class Solution {
2    public int firstMatchingIndex(String s) {
3    int i=0;
4    int j=s.length()-1;
5    while(i<=j){
6        if(s.charAt(i)!=s.charAt(j)){
7            i++;
8            j--;
9        }
10        else{
11            return i;
12        }
13    }
14    return -1;
15    }
16}