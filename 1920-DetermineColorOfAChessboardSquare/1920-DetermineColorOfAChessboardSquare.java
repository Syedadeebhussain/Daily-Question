// Last updated: 31/7/2025, 2:23:56 pm
class Solution {
    public boolean squareIsWhite(String coordinates) {
    char ch=coordinates.charAt(0);
     char ch1=coordinates.charAt(1);
    int ans1=ch-'a';
    int ans2=ch1-'0';
     return (ans1+ans2+1)%2!=0;
}
}