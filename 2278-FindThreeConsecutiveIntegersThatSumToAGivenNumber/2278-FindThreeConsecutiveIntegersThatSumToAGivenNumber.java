// Last updated: 31/7/2025, 2:23:13 pm
class Solution {
    public long[] sumOfThree(long num) {
    long x=num/3;
    long[] emptyArray = {};
    if(x-1+x+x+1==num){
             long [] arr={x-1,x,x+1};
             return arr;
    }
    return emptyArray;
    }
}