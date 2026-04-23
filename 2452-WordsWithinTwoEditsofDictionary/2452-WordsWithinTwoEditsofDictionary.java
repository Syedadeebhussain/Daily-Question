// Last updated: 24/4/2026, 2:00:02 am
1class Solution {
2    public List<String> twoEditWords(String[] queries, String[] dictionary) {
3    List<String> ll=new ArrayList<>();
4    for(String s1:queries){
5        for(String s2:dictionary){
6            if(isValid(s1,s2)){
7                ll.add(s1);
8                break;
9            }
10        }
11    }
12    return ll;
13    }
14    public boolean isValid(String s1,String s2){
15        int c=0;
16        for(int i=0;i<s1.length();i++){
17            if(s1.charAt(i)!=s2.charAt(i)){
18                c++;
19            }
20        }
21        return c<=2;
22    }
23}