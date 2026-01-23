// Last updated: 23/1/2026, 10:05:33 am
1class Solution {
2    public int minimumSum(int num) {
3    String s=Integer.toString(num);
4    char [] ch=s.toCharArray();
5     Arrays.sort(ch);
6    int num1=(ch[0] - '0')*10 +(ch[2] - '0');
7    int num2=(ch[1] - '0')*10 +(ch[3] - '0');
8        return num1+num2;
9    }
10}