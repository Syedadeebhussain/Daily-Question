// Last updated: 31/7/2025, 2:21:38 pm
// class Solution {
//     public String convertDateToBinary(String date) {
//         int y=Integer.parseInt(date.substring(0,4));
//        String year= Integer.toBinaryString(y);
//         int m=Integer.parseInt(date.substring(5,7));
//         String mm=  Integer.toBinaryString(m);
//           int d=Integer.parseInt(date.substring(8));
//         String dd=  Integer.toBinaryString(d);
//         String res=year+"-"+mm+"-"+dd;
//         return res;    
//     }
// }
class Solution {
    public String convertDateToBinary(String date) {
        String [] str = date.split("-");
        for(int i=0;i<str.length;i++){
            str[i] = Integer.toBinaryString(Integer.parseInt(str[i]));
        }
        return String.join("-", str);
    }
}