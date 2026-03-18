// Last updated: 18/3/2026, 11:22:12 pm
1class Solution {
2    public String longestPalindrome(String s) {
3        int max=Integer.MIN_VALUE;
4        String ans="";
5        if(s.length()<=1){
6            return s;
7        }
8         if(ispal(s)){
9            return s;
10        } 
11        for(int i=0;i<s.length();i++){
12            for(int j=i+1;j<=s.length();j++){
13                if(ispal(s.substring(i,j))){
14                   if(max<(s.substring(i,j)).length()){
15                    max=(s.substring(i,j)).length();
16                    ans=s.substring(i,j);
17                   }
18                }
19            }
20        }
21        return ans;
22    }
23    public static boolean ispal(String s){
24        int i=0;
25        int j=s.length()-1;
26        while(i<=j){
27            if(s.charAt(i)!=s.charAt(j)){
28                return false;
29            }
30            i++;
31            j--;
32        }
33        return true;
34    }
35}