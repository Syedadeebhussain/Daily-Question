// Last updated: 1/10/2025, 11:25:50 am
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
     int s=0;
     s+=numBottles;
     while(numBottles>=numExchange){
        s+=numBottles/numExchange;
        numBottles=numBottles/numExchange+numBottles%numExchange; // how many empty bottles are remaining
     }
     return s;
    }
}