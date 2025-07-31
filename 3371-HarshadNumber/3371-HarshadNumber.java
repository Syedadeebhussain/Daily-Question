// Last updated: 31/7/2025, 2:21:55 pm
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=sumOf(x);
        if(x%sum==0){
            return sum;
        }
        return -1;
    }
    public int sumOf(int x){
        int s=0;
        while(x>0){
            s+=x%10;
            x=x/10;
        }
        return s;
    }
}