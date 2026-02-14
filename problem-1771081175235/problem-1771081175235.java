// Last updated: 14/2/2026, 8:29:35 pm
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3    StringBuilder sb=new StringBuilder();
4     for(int i=0;i<words.length;i++){
5         String s=words[i];
6         int sum=find(s,weights);
7         System.out.println(sum);
8         sb.append((char)('z'-sum%26));
9     }   
10        return sb.toString();
11    }
12    public int find(String s,int [] weights){
13        int sum=0;
14        for(int i=0;i<s.length();i++){
15            sum+=weights[s.charAt(i)-'a'];
16        }
17        return sum;
18    }
19}