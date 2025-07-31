// Last updated: 31/7/2025, 2:23:55 pm
// class Solution {
//     public String truncateSentence(String s, int k) {
//         String str="";
//         s=s+" ";
//         int c=0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)==' '){
//                 c++;
//             }
//             str+=s.charAt(i);
//             if(c==k){
//                 return str.trim();
//             }
//         }
//         return "adeeb";
//     }

// }
class Solution {
    public String truncateSentence(String s, int k) {
        int c=0;
        int i;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
                c++;
             if(c==k)
                break;
        }
        return s.substring(0, i);
        }}