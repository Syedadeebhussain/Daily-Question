// Last updated: 31/7/2025, 2:23:23 pm
class Solution {
    public boolean checkAlmostEquivalent(String num1, String num2) {
  int [] freq=new int [26];
    for(int i=0;i<num1.length();i++)
    {
        freq[num1.charAt(i)-'a']++;
    }
    int [] freq1=new int [26];
    for(int i1=0;i1<num2.length();i1++)
    {
        freq1[num2.charAt(i1)-'a']++;
    }

    for(int i2=0;i2<freq.length;i2++)
    {
        int a=freq[i2];
        int b=freq1[i2];
        if(Math.abs(a-b)>3)
        {
            return false;
        }
    }
    return true;
    }
}
