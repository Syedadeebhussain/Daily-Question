// Last updated: 31/7/2025, 2:23:48 pm
class Solution {
    public String sortSentence(String s) {
    String [] str=s.split(" ");
    String [] arr=new String [str.length];
    for(int i=0;i<arr.length;i++){
        int index=str[i].charAt(str[i].length()-1)-'1';
        arr[index]=str[i].substring(0, str[i].length() - 1); 
    }
    return String.join(" ", arr);
    }
}