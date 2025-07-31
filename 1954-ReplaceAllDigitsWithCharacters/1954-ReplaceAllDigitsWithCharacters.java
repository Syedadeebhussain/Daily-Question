// Last updated: 31/7/2025, 2:23:52 pm
// class Solution {
//     public String replaceDigits(String s) {
//      String st="";
//      for(int i=0;i<s.length();i++){
//         char ch=s.charAt(i);
//         if(i%2==0){
//             st+=ch;
//         }
//         else{
//             int num=ch-'0';
//              char ch1=s.charAt(i-1);
//              char ch2=(char)(ch1+num);
//             st+=ch2;
//                     }
//      }   
//      return st;
//     }
// }

class Solution {
    public String replaceDigits(String s) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length(); i++){

            if( i % 2 != 0){
            sb.append((char)(s.charAt(i-1) + s.charAt(i) - '0'));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
       return  sb.toString();
        
    }
}