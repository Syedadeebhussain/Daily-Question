// Last updated: 31/7/2025, 2:23:04 pm
class Solution {
    public boolean digitCount(String num) {
    int [] freq=new int [10];
    for(int i=0;i<num.length();i++)
    {
        freq[num.charAt(i)-'0']++;
    }
    for(int i1=0;i1<num.length();i1++)
    {
        if(num.charAt(i1)-'0'!=freq[i1])
        {
         return false;
        }

    }
    return true;
    }
}