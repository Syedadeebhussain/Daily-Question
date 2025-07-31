// Last updated: 31/7/2025, 2:24:43 pm
class Solution {
    public int numberOfSubstrings(String s) {
    int si=0;
    int ei=0;
    int [] freq=new int[3];
    int ans=0;
    while(ei<s.length())
    {
         char ch=s.charAt(ei);
         freq[ch-'a']++;
         while(freq[0]>0 && freq[1]>0 && freq[2]>0){
         ans+=s.length()-ei;
         freq[s.charAt(si)-'a']--;
         si++;
        }
        ei++;
    }
    return ans;
    }
}