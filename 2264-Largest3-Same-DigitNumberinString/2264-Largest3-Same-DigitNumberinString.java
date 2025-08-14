// Last updated: 14/8/2025, 7:43:18 am
class Solution {
    public String largestGoodInteger(String num) {
       for(int i=999;i>=000;i=i-111){
        String str =String.format("%03d",i);
        if(num.contains(str)){
            return str;
        }
       } 
       return "";
    }
}