// Last updated: 31/7/2025, 2:21:17 pm
class Solution {
    public int maxFreqSum(String s) {
     int []  freq=new int[26] ;
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        freq[ch-'a']++;
     } 
     int max1=0;
     int max2=0;
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
          max1=Math.max(freq[ch-'a'],max1);
        }
        else{
              max2=Math.max(freq[ch-'a'],max2);
        }
     } 
     return max1+max2;
    }
}