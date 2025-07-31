// Last updated: 31/7/2025, 2:22:12 pm
class Solution {
    public String sortVowels(String s) {
     char[] arr = s.toCharArray();
     List<Character> ll=new ArrayList<>();
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            ll.add(ch);
        }

     }
     Collections.sort(ll);
      int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if ("aeiouAEIOU".indexOf(arr[i]) != -1) {
                arr[i] = ll.get(j);
                j++;
            }
        }

        return new String(arr);
    }
}