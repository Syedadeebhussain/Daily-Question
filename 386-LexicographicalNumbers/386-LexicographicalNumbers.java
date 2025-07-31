// Last updated: 31/7/2025, 2:25:52 pm
class Solution {
    public List<Integer> lexicalOrder(int n) {
      List<Integer> ll=new ArrayList<>();
      print(n,0,ll); 
      return ll;  
    }
   public static void print(int n,int curr,List<Integer> ll) {
	if(curr>n) {
		return ;
	}
    if(curr!=0)
    {
	ll.add(curr);
    }
	int i=0;
	if(curr==0)
	{
		i=1;
	}
	for(;i<=9;i++)
	{
		print(n,curr*10+i,ll);
	}
}
}