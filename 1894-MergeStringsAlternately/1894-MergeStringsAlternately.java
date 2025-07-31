// Last updated: 31/7/2025, 2:24:02 pm
class Solution {
    public String mergeAlternately(String word1, String word2) {
//     String s="";
//     int i=0;
//     int j=0;
//     while(i<word1.length() || j<word2.length()){
//     if(i<word1.length()){
//          char ch=word1.charAt(i);
//          s+=ch;
//          i++;

//     }
//     if(j<word2.length()){
//          char ch1=word2.charAt(j);
//          s+=ch1;
//          j++;
//     }
    
//     }
//     return s;
// }
// }
StringBuilder res = new StringBuilder();
        int min = Math.min(word1.length(), word2.length());
        for(int i = 0; i < Math.min(word1.length(), word2.length());i++){
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }
        if(word1.length()>word2.length()){
            res.append(word1.substring(min));
        }else{
            res.append(word2.substring(min));
        }

        return res.toString();
    }
}