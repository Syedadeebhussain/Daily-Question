// Last updated: 31/7/2025, 2:22:42 pm
class Solution {
    public double[] convertTemperature(double celsius) {
    double [] ans=new double[2];
    ans[0]=celsius+273.15;
    ans[1]=celsius*1.80+32.00;
    return ans;
    }
}