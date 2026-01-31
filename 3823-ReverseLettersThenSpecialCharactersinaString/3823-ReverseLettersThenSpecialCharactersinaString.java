// Last updated: 31/1/2026, 10:43:04 pm
1class Solution {
2    public String reverseByType(String s) {
3        char[] arr = s.toCharArray();
4        int i = 0;                
5        int j = arr.length - 1;
6        while (i < j) {
7            if (Character.isLetter(arr[i]) && Character.isLetter(arr[j])) {
8                char temp = arr[i];
9                arr[i] = arr[j];
10                arr[j] = temp;
11                i++;
12                j--;
13            }
14            else if (!Character.isLetter(arr[i])) {
15                i++;
16            }
17            else if (!Character.isLetter(arr[j])) {
18                j--;
19            }
20        }
21    int i1 = 0;                
22    int j1 = arr.length - 1;
23    while (i1 < j1) {
24        if (!Character.isLetter(arr[i1]) && !Character.isLetter(arr[j1])) {
25            char temp = arr[i1];
26            arr[i1] = arr[j1];
27            arr[j1] = temp;
28            i1++;
29            j1--;
30        }
31        else if (Character.isLetter(arr[i1])) {
32            i1++;
33        }
34        else if (Character.isLetter(arr[j1])) {
35            j1--;
36        }
37    }
38
39        return new String(arr);
40    }
41}
42