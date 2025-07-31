// Last updated: 31/7/2025, 2:24:05 pm
class Solution {
    public String largestMerge(String word1, String word2) {
    int m=word1.length();
    int n=word2.length();
    int i=0,j=0;
    StringBuilder st=new StringBuilder();
    while(i<m && j<n){
     if(word1.substring(i).compareTo(word2.substring(j)) > 0){
        st.append(word1.charAt(i));
        i++;
     }
     else{
        st.append(word2.charAt(j));
        j++;
     }
    }
    if(i!=m){
    st.append(word1.substring(i));
    }
    if( j!=n){
    st.append(word2.substring(j));}
    return st.toString();
    }
}