// Last updated: 24/11/2025, 7:56:45 pm
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ll=new ArrayList<>();
        String s="";
        int num=0;
        for(int i:nums){
            num=(num*2+i)%5;
            ll.add(num==0);
        }
        return ll;
    }
}