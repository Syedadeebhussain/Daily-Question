// Last updated: 21/12/2025, 1:18:02 pm
1class Solution {
2    public String makeLargestSpecial(String s) {
3        List<String> ll=new ArrayList<>();
4        int start=0;
5        int c=0;
6        for(int i=0;i<s.length();i++){
7            if(s.charAt(i)=='1') c++;
8            else c--;
9            if(c==0){
10               ll.add('1'+makeLargestSpecial(s.substring(start+1,i))+'0');
11               start=i+1;
12            }
13        }
14        Collections.sort(ll, Collections.reverseOrder());
15        StringBuilder sb = new StringBuilder();
16        for (String r : ll) sb.append(r);
17        return sb.toString();
18    }
19}