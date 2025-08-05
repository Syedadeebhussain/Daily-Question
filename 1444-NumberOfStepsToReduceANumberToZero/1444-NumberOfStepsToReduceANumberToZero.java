// Last updated: 5/8/2025, 3:01:18 pm
class Solution {
    public int numberOfSteps(int num) {
      int c=0;
      while(num!=0){
        if(num%2==0){
            num/=2;
        }
        else{
            num--;
        }
        c++;
      }  
      return c;
    }
}