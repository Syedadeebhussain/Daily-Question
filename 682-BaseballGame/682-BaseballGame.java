// Last updated: 31/7/2025, 2:25:26 pm
class Solution {
    public int calPoints(String[] s) {
     Stack<Integer> st=new Stack<>();
     for(int i=0;i<s.length;i++)
     {
        if(s[i].equals("D"))
        {
        
        st.push(2*st.peek());
        }   
        else if(s[i].equals("C"))   {
        st.pop();
        }     
        else if(s[i].equals("+")){
        int a=st.pop();
        int b=st.pop();
        int c=a+b;
        st.push(b);
        st.push(a);
        st.push(c);
        }
        else
        {
        st.push(Integer.parseInt(s[i]));
        }

     }  
     int sum=0; 
     for(int x:st)
     {
     sum+=x;
     }
     return sum;
    }
}