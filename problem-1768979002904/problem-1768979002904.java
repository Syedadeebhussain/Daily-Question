// Last updated: 21/1/2026, 12:33:22 pm
1class Solution {
2    public int minimizeXor(int num1, int num2) {
3     int set_bit=0;
4     while(num2!=0){
5        num2=(num2&(num2-1));
6        set_bit++;
7     }  
8     int x=0;
9     for(int i=30;i>=0;i--){
10        int mask=(1<<i);
11        if((num1&mask)!=0){
12            x|=mask;
13            set_bit--;
14            if(set_bit==0) return x;
15        }
16     } 
17    
18     for(int i=0;i<=32;i++){
19        int mask=(1<<i);
20        if((num1&mask)==0){
21            x|=mask;
22            set_bit--;
23            if(set_bit==0) return x;
24        }
25     } 
26     return x;
27    }
28}