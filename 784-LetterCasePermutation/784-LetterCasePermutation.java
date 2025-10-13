// Last updated: 13/10/2025, 10:00:50 pm
class Solution {
    public List<String> letterCasePermutation(String s) {
      List<String> ll=new ArrayList<>();
      char [] ch=s.toCharArray();
      find(ch,ll,0);  
      return ll;
    }
    public void find(char[]arr,List<String> ll,int i){
        if(i==arr.length){
            ll.add(new String(arr));
            return;
        }
        if(Character.isLetter(arr[i])){
            arr[i]=Character.toLowerCase(arr[i]);
            find(arr,ll,i+1);
            arr[i]=Character.toUpperCase(arr[i]);
            find(arr,ll,i+1);
        }
        else{
            find(arr,ll,i+1);
        }
    }
}