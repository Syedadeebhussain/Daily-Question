// Last updated: 23/12/2025, 1:27:08 pm
1class Solution {
2    public String generateTag(String caption) {
3        StringBuilder sb = new StringBuilder();
4        sb.append('#');
5
6        String[] words = caption.trim().split("\\s+");
7        boolean firstWord = true;
8        for (String word : words) {
9            StringBuilder clean = new StringBuilder();
10            for (char c : word.toCharArray()) {
11                if (Character.isLetter(c)) {
12                    clean.append(Character.toLowerCase(c));
13                }
14            }
15            if (clean.length() == 0) continue;
16            if (firstWord) {
17                sb.append(clean);
18                firstWord = false;
19            } else {
20                sb.append(Character.toUpperCase(clean.charAt(0)));
21                sb.append(clean.substring(1));
22            }
23            if (sb.length() >= 100) {
24                break;
25            }
26        }
27        if (sb.length() > 100) {
28            sb.setLength(100);
29        }
30
31        return sb.toString();
32    }
33}
34