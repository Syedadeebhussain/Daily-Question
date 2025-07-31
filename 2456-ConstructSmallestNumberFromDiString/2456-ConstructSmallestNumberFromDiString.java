// Last updated: 31/7/2025, 2:22:55 pm
class Solution {
    public String smallestNumber(String str) {
	return  Construc_Smallest_Number(str);
}
public static String Construc_Smallest_Number(String str) {
	int [] ans=new int[str.length()+1];
	int c=1;
	Stack<Integer> st=new Stack<>();
	for(int i=0;i<=str.length();i++)
	{
		if(i==str.length()||str.charAt(i)=='I') {
			ans[i]=c;
			c++;
			while(!st.isEmpty())
			{
				ans[st.pop()]=c;
				c++;
			}
			}
		else
		{
			st.push(i);
		}
	}
	String s="";
	for(int v:ans)
	{
		s+=v;
	}
	return s;
}
}
