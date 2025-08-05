// Last updated: 5/8/2025, 2:58:57 pm
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
             String st=Integer.toString(i);
            if (st.length() % 2 != 0) continue;
            int half=st.length()/2;
            int s1=0,s2=0;
            for(int i1=0;i1<half;i1++){
                s1+=st.charAt(i1)-'0';
            }
            for(int j=half;j<st.length();j++){
                s2+=st.charAt(j)-'0';
            }
            if(s1==s2){
                c++;
            }
        }
        return c;
    }

}