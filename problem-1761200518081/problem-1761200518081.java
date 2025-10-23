// Last updated: 23/10/2025, 11:51:58 am
class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2)
        {
            StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            int ch1=s.charAt(i)-'0';
            int ch2=s.charAt(i+1)-'0';
            int ans=(ch1+ch2)%10;
            st.append(ans);
             }
        s=st.toString();
        }
        return s.charAt(0)==s.charAt(1);
        
    }

}