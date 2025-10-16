// Last updated: 16/10/2025, 10:40:15 pm
class Solution {
    public int[] finalPrices(int[] prices) {
    int [] arr =new int [prices.length];
    for(int i=0;i<prices.length;i++){
        int dis=0;
        for(int j=i+1;j<prices.length;j++){
            if(prices[i]>=prices[j]){
                dis=prices[j];
                break;
            }
        }
        arr[i]=prices[i]-dis;
    }
    return arr;
    }
}