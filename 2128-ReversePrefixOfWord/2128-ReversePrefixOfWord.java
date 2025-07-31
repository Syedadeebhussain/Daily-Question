// Last updated: 31/7/2025, 2:23:32 pm
class Solution {
    public String reversePrefix(String word, char ch) {
    //findex index 
    int index=0;
    for(int i=0;i<word.length();i++)
    {
        if(word.charAt(i)==ch)
        {
            index=i;
            break;
        }
    }  
    //creating stack
    Stack<Character> st=new Stack<>();
    for(int j=0;j<=index;j++)
    {
        st.push(word.charAt(j));
    }
    String str="";
    for(int i1=0;i1<=index;i1++)
    {
        char c=st.pop();
        str+=c;
    }
    str+=word.substring(index+1);
    return str;
    }
  
}