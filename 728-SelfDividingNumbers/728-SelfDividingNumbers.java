// Last updated: 31/7/2025, 9:57:56 pm
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> st=new ArrayList<>();
        for(int i=left;i<=right;i++){
            boolean flag=true;
            int n=i;
            while(n!=0){
                int r=n%10;
                if(r==0 || i%r!=0){
                    flag=false;
                    break;
                }
                n/=10;
            }
            if(flag==true){
                st.add(i);
            }
            
        }
        return st;
    }
}