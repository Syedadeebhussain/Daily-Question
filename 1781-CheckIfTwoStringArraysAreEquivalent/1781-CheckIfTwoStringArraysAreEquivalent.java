// Last updated: 31/7/2025, 2:24:19 pm
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1=find(word1);
        String s2=find(word2);
        return s1.equals(s2);

    }
    public String find(String[] arr){
        String s="";
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        return s;
    }
}