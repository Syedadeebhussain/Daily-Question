// Last updated: 31/7/2025, 2:27:57 pm
class Solution {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {
        List<String> ll=new ArrayList<>();
        if(digits.length()==0){
            return ll;
        }
        print(digits,"",ll);
	    return ll;
		
    }
public static void print(String ques,String ans,List<String> ll) {
	if(ques.length()==0) {
	ll.add(ans);
		return;
	}
	char ch=ques.charAt(0);
	String getstring=key[ch-'0'];
	for(int i=0;i<getstring.length();i++) {
		print(ques.substring(1),ans+getstring.charAt(i),ll);
	}
}
}