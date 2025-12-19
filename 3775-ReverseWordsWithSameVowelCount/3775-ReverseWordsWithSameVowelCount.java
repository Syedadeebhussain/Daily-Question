// Last updated: 19/12/2025, 9:33:32 am
1class Solution {
2    public String reverseWords(String s) {
3    String [] arr=s.split(" ");
4    int c=count(arr[0]);
5    for(int i=1;i<arr.length;i++){
6        if(count(arr[i])==c){
7            arr[i]=new StringBuilder(arr[i]).reverse().toString();
8        }
9    }
10    String st="";
11    for(int i=0;i<arr.length;i++){
12        st+=arr[i]+" ";
13    }
14    return st.trim();
15    }
16    public int count(String s){
17        int c=0;
18        for(int i=0;i<s.length();i++){
19            char ch=s.charAt(i);
20            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
21                c++;
22            }
23        }
24        return c;
25    }
26}