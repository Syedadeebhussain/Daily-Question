// Last updated: 31/7/2025, 2:23:51 pm
class Solution {
    public boolean checkIfPangram(String s) {
    int []  freq=new int[26] ;
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        freq[ch-'a']++;
     } 
     for(int i=0;i<freq.length;i++){
        if(freq[i]==0){
            return false;
        }
     } 
     return true;
    }
}