// Last updated: 31/7/2025, 2:26:10 pm
class Solution {
    public boolean isAnagram(String s, String t) {
        return anag(s,t);
    }
    public static boolean anag(String s,String str)
    {
        if(s.length()==str.length())
        {
        char[] arr=s.toCharArray();
        char[] arr1=str.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        String a=new String(arr);
        String b=new String(arr1);
        if(a.equals(b))
        return true;
        else
        return false;
        }
        else
        {
            return false;
        }
    }
}