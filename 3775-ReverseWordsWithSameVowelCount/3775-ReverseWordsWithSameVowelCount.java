// Last updated: 19/12/2025, 9:37:10 am
1class Solution {
2    public String reverseWords(String s) {
3    String [] arr=s.split(" ");
4    int c=count(arr[0]);
5    StringBuilder sb = new StringBuilder();
6    sb.append(arr[0]);
7    for(int i=1;i<arr.length;i++){
8        if(count(arr[i])==c){
9            arr[i]=new StringBuilder(arr[i]).reverse().toString();
10        }
11        sb.append(" "+arr[i]);
12    }
13    return sb.toString();
14    }
15    public int count(String s){
16        int c=0;
17        for(char ch:s.toCharArray()){
18            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
19                c++;
20            }
21        }
22        return c;
23    }
24}