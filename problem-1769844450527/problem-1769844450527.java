// Last updated: 31/1/2026, 12:57:30 pm
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        int lo = 0;
4        int hi = letters.length - 1;
5        char ans=letters[0] ;
6        while (lo<=hi) {
7            int mid=(lo+hi)/2;
8            if (letters[mid]>target) {
9                ans=letters[mid];   
10                hi=mid-1;    
11            } else{
12                lo=mid+1;   
13            }
14        }
15        return ans;
16    }
17}
18