// Last updated: 31/7/2025, 2:24:13 pm
class Solution {
    public int minPartitions(String n) {
     int ans=Integer.MIN_VALUE;
    for(int i=0;i<n.length();i++){
        char ch=n.charAt(i);
        ans=Math.max(ans,ch-'0');
    }
    return ans;
}
}