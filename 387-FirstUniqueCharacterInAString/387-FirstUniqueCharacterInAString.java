// Last updated: 31/7/2025, 2:25:51 pm
class Solution {
    public int firstUniqChar(String s) {
     int[] freq = new int[26];
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        int idx=ch-'a';
        freq[idx]++;
    } 
     for(int i=0;i<s.length();i++)
    {
        char ch1=s.charAt(i);
       int  idx1=ch1-'a';
        if(freq[idx1]==1){
            return i;
        }
    } 
    return -1;
    }
}