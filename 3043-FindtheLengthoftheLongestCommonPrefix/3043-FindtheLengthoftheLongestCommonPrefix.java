// Last updated: 1/9/2025, 10:00:04 pm
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
    int c=0;
    HashSet<String> st=new HashSet<>();
    for(int i=0;i<arr1.length;i++){
        String ans1="";
        String s=Integer.toString(arr1[i]);
        for (char ch : s.toCharArray()) {
                ans1 += ch;
        st.add(ans1);

            }
    }    
    for(int i=0;i<arr2.length;i++){
        String strNum = Integer.toString(arr2[i]);
        String ans="";
        for (char ch : strNum.toCharArray()) {
                ans += ch;
                if (st.contains(ans)) {
                    c=Math.max(c,ans.length());
                }
            }
    }
    return c;
    }
}