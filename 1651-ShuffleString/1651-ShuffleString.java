// Last updated: 31/7/2025, 2:24:23 pm
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            res[indices[i]]=s.charAt(i);    
        }
        return new String(res);
    }
}