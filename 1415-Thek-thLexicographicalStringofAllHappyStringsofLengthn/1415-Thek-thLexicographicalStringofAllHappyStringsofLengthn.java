// Last updated: 14/3/2026, 11:35:06 am
1// class Solution {
2//     List<String> ll=new ArrayList<>();
3//     String str;
4//     public String getHappyString(int n, int k) {
5//        str="abc"; 
6//        Solve(n,"");
7//        Collections.sort(ll);
8//        System.out.println(ll);
9//        return k<=ll.size()?ll.get(k-1):"";
10//     }
11//     public void Solve(int n,String ans){
12//     if(ans.length()==n){
13//         ll.add(ans);
14//         return;
15//     }
16//     for(int i=0;i<3;i++){
17//         if(ans.length()==0 || ans.charAt(ans.length()-1)!=str.charAt(i))
18//         {
19//         Solve(n,ans+""+str.charAt(i));
20//         }
21//     }
22//     }
23// }
24class Solution {
25    String str = "abc";
26    int count = 0;
27    String result = "";
28    public String getHappyString(int n, int k) {
29        Solve(n, k, "");
30        return result;
31    }
32    public void Solve(int n, int k, String ans) {
33        if (!result.isEmpty()) return;
34        if (ans.length() == n) {
35            count++;
36            if (count == k) {
37                result = ans;
38            }
39            return;
40        }
41        for (int i = 0; i < 3; i++) {
42            if (ans.length() == 0 || ans.charAt(ans.length() - 1) != str.charAt(i)) {
43                Solve(n, k, ans + str.charAt(i));
44            }
45        }
46    }
47}
48