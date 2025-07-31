// Last updated: 31/7/2025, 9:13:46 pm
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
             String st=Integer.toString(i);
            if (st.length() % 2 != 0) continue;
             int s1=sum(Integer.parseInt(st.substring(0,st.length()/2)));
             int s2=sum(Integer.parseInt(st.substring(st.length()/2)));
             if(s1==s2){
                c++;
             }
        }
        return c;
    }
    public static int sum(int n){
        int s=0;
        while(n!=0){
           s+=n%10;
            n/=10;
        }
        return s;
    }
}