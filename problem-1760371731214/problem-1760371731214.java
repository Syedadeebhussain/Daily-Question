// Last updated: 13/10/2025, 9:38:51 pm
class Solution {
    public List<String> removeAnagrams(String[] words) {
    Stack<String> st=new Stack<>();
    st.push(words[0]);
    for(int i=1;i<words.length;i++){
       if(!isAnagram(st.peek(),words[i])){
        st.push(words[i]);
       }
    } 
    List<String> ll=new ArrayList<>();
    while(!st.isEmpty()){
        ll.add(st.pop());
    }
    Collections.reverse(ll);
    return ll;
    }
    public boolean isAnagram(String str1,String str2){
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}