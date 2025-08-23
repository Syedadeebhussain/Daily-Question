// Last updated: 23/8/2025, 6:48:15 pm
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
     String[] st=new String[names.length];
     TreeMap<Integer,String> map1 = new TreeMap<>();
    for (int i = 0; i < names.length; i++) {
    map1.put(heights[i], names[i]);
    }  
    int j=0;
    for (Integer key : map1.descendingKeySet()) {
        st[j]=map1.get(key);
        j++;
     }
     return st;
    }
}