// Last updated: 27/10/2025, 11:35:31 pm
class Solution {
    public int numberOfBeams(String[] bank) {
     int ans=0;
     int p1=0;
     for(String str:bank){
        int c1=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1') {
                c1++;
            }
        }
        if(c1>0)
        {
         ans+=p1*c1;
        p1=c1;
        }
       
     }   
     return ans;
    }
}