// Last updated: 31/7/2025, 2:24:59 pm
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
     String [] s=text.split(" ");
    List<String> ll=new ArrayList<>();
     for(int i=0;i<s.length-2;i++)
    {
       if(s[i].equals(first) && s[i+1].equals(second)){
             ll.add(s[i+2]);
       }
    }
    String[] array = ll.toArray(new String[0]);

    return array;
    }
}