// Last updated: 24/5/2026, 8:34:05 pm
1class Solution {
2    public int passwordStrength(String password) {
3        HashSet<Character> set=new HashSet<>();
4        int score=0;
5        for(int i=0;i<password.length();i++) {
6            char ch=password.charAt(i);
7            if(set.contains(ch)) {
8                continue;
9            }
10            set.add(ch);
11            if(Character.isLowerCase(ch)) {
12                score += 1;
13            }
14            else if(Character.isUpperCase(ch)) {
15                score += 2;
16            }
17            else if(Character.isDigit(ch)) {
18                score += 3;
19            }
20            else if(!Character.isLetterOrDigit(ch)) {
21                score += 5;
22            }
23        }
24        return score;
25    }
26}