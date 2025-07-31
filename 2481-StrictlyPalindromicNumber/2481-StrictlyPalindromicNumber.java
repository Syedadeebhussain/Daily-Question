// Last updated: 31/7/2025, 2:22:52 pm
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
          int s=base(i);
          if(!palin(s)){
            return false;
          }
        }
        return true;
    }
    public static boolean palin(int n){
        String s=String.valueOf(n); 
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
 return true;
    }
    public static int base(int n){
        int s=0;
        int i=0;
        while(n>0){
            int r=n%2;
            s+=r*Math.pow(10,i);
            n=n/2;
            i++;
    }
    return s;
}
}