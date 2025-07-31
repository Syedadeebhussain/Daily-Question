// Last updated: 31/7/2025, 2:24:01 pm
class Solution {
    public int[] minOperations(String boxes) {
        int [] arr=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            for(int j=0;j<boxes.length();j++){
                if(boxes.charAt(j)=='1'){
                          arr[i]+=Math.abs(i-j);
                }
            }
        }
        return arr;
    }
}