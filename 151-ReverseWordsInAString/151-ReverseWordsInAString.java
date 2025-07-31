// Last updated: 31/7/2025, 2:26:40 pm
class Solution {
    public String reverseWords(String s) {
      s=s.trim();
      String [] arr=s.split(" +");/*to remove more then one spaces*/
      System.out.println(Arrays.toString(arr));
      String w="";
      for(int i=arr.length-1;i>=0;i--)
      {
    	  w+=arr[i]+" ";
      }
      return w.trim();
    }
}