// Last updated: 31/7/2025, 2:22:29 pm
class Solution {
    public int sumOfMultiples(int n) {
        int s=0;
     for(int i=1;i<=n;i++){
        if(i%3==0 ||i%5==0 ||i%7==0){
            s+=i;
        }
     
    }
    return s;   

    }
}