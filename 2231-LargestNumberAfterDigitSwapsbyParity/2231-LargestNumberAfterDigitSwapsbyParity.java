// Last updated: 31/10/2025, 10:12:58 am
class Solution {
    public int largestInteger(int num) {
    List<Integer> odd=new ArrayList<>();
     List<Integer> even=new ArrayList<>();
     char [] ch=String.valueOf(num).toCharArray();
    for(char c:ch){
        if((c-'0')%2==0){
            even.add(c-'0');
        }
        else{
            odd.add(c-'0');
        }
    }
     Collections.sort(odd, Collections.reverseOrder());
     Collections.sort(even, Collections.reverseOrder());
     int i=0;
     int j=0;
     StringBuilder st=new StringBuilder();
     for (char c:ch){
        if((c-'0')%2==0){
            st.append(even.get(i));
            i++;
        }
        else{
            st.append(odd.get(j));
            j++;
        }
     }
     return Integer.parseInt(st.toString());
    }
}