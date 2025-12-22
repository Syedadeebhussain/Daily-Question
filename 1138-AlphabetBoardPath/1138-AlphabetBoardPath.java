// Last updated: 22/12/2025, 12:14:10 pm
1class Solution {
2    public String alphabetBoardPath(String target) {
3    StringBuilder sb=new StringBuilder();
4    int r=0;
5    int c=0;
6    for(char ch:target.toCharArray()){
7       int tr=(ch-'a')/5;
8       int tc=(ch-'a')%5;
9       while(r>tr){
10        sb.append('U');
11        r--;
12       }
13       while(c>tc){
14        sb.append('L');
15        c--;
16       }
17       while(tr>r){
18        sb.append('D');
19        r++;
20       }
21       while(tc>c){
22        sb.append('R');
23        c++;
24
25       }
26       sb.append('!');
27    }  
28    return sb.toString();
29    }
30}