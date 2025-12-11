// Last updated: 11/12/2025, 9:03:14 pm
1class Solution {
2    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
3    public List<String> letterCombinations(String digits) {
4        List<String> ll=new ArrayList<>();
5        if(digits.length()==0){
6            return ll;
7        }
8        print(digits,"",ll);
9	    return ll;
10		
11    }
12public static void print(String ques,String ans,List<String> ll) {
13	if(ques.length()==0) {
14	ll.add(ans);
15		return;
16	}
17	char ch=ques.charAt(0);
18	String getstring=key[ch-'0'];
19	for(int i=0;i<getstring.length();i++) {
20		print(ques.substring(1),ans+getstring.charAt(i),ll);
21	}
22}
23}