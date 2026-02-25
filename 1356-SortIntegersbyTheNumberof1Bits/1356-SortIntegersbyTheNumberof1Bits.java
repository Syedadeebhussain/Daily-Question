// Last updated: 25/2/2026, 7:47:44 pm
1class Solution {
2    public int[] sortByBits(int[] arr) {
3        Integer[] temp = new Integer[arr.length];
4        for(int i = 0; i < arr.length; i++){
5            temp[i] = arr[i];
6        }
7        Arrays.sort(temp, (a, b) -> {
8           return Integer.compare(Integer.bitCount(a), Integer.bitCount(b))==0
9           ?Integer.compare(a, b)
10           : Integer.compare(Integer.bitCount(a),Integer.bitCount(b));
11           });
12        for(int i = 0; i < arr.length; i++){
13            arr[i] = temp[i];
14        }
15        return arr;
16    }
17}
18