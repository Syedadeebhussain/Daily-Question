// Last updated: 26/8/2025, 9:15:06 am
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max=0;
        int r=0;
        for(int i=0;i<dimensions.length;i++){
                int a=dimensions[i][0];
                int b=dimensions[i][1];
                int d=a*a+b*b;
                int  area=a*b;
                if(d>max ||(d==max && area>r)){
                    max=d;
                    r=area;
                }
        }
        return r;
    }
}