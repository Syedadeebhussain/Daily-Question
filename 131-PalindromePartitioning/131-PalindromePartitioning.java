// Last updated: 31/7/2025, 2:26:51 pm
class Solution {
    public List<List<String>> partition(String s) {
        List<String> ll=new ArrayList<String>();
        List<List<String>> ans = new ArrayList<>();
        print(s,ll,ans);
        return ans;
    }
    public static void print(String s,List<String> ll,List<List<String>> ans){
        if(s.length()==0){
        ans.add(new ArrayList<>(ll));
        }
        for(int i=0;i<s.length();i++){
            String a=s.substring(0,i+1);
            if(isPalindromic(a))
            {
            ll.add(a);
           print(s.substring(i+1),ll,ans);
           ll.remove(ll.size()-1);
            }
            
        }
    }
    public static boolean isPalindromic(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}