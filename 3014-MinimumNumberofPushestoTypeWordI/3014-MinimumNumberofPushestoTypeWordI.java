// Last updated: 30/7/2026, 10:48:30 pm
1class Solution {
2    public int minimumPushes(String word) {
3    int sum=0;
4    int len=word.length();
5    if(len<=8){
6        sum+=len;
7    }
8    else if(len<=16){
9        sum+=8;
10        sum+=2*(len-8);
11    }
12    else if(len<=24){
13        sum+=8;
14        sum+=16;
15        sum+=3*(len-16);
16    }
17    else if(len<=26){
18        sum+=8;
19        sum+=16;
20        sum+=24;
21        sum+=4*(len-24);
22    }
23    return sum;
24    }
25}