// Last updated: 15/7/2026, 9:30:35 am
1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3      int so=0;
4      int se=0;
5      for(int i=1;i<=2*n;i++){
6        if(i%2==0){
7            se+=i;
8        }
9        else{
10            so+=i;
11        }
12      }
13      return gcd(se,so);
14      
15    }
16    public int gcd(int a,int b){
17        while(a%b!=0){
18            int temp=b;
19            b=a%b;
20            a=temp;
21        }
22        return b;
23    }
24   
25}