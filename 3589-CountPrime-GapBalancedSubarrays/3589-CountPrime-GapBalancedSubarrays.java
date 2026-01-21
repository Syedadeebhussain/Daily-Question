// Last updated: 21/1/2026, 10:27:37 pm
1class Solution {
2    public int primeSubarray(int[] nums, int k) {
3        int left = 0;
4        int right = 0;
5        int answer = 0;
6        TreeMap<Integer, Integer> primeValues = new TreeMap<>();
7        ArrayList<Integer> primePos = new ArrayList<>();
8
9        while (right < nums.length) {
10
11            if (isPrime(nums[right])) {
12                primeValues.put(nums[right], primeValues.getOrDefault(nums[right], 0) + 1);
13                primePos.add(right);
14            }
15            while (!primeValues.isEmpty() &&
16                   primeValues.lastKey() - primeValues.firstKey() > k) {
17                if (isPrime(nums[left])) {
18                    int val = nums[left];
19                    primeValues.put(val, primeValues.get(val) - 1);
20                    if (primeValues.get(val) == 0) {
21                        primeValues.remove(val);
22                    }
23                    primePos.remove(0);
24                }
25                left++;
26            }
27            if (primePos.size() >= 2) {
28                int secondLastPrime = primePos.get(primePos.size() - 2);
29                answer += (secondLastPrime - left + 1);
30            }
31            right++;
32        }
33        return answer;
34    }
35
36    private boolean isPrime(int num) {
37        if (num <= 1) return false;
38        if (num == 2) return true;
39        if (num % 2 == 0) return false;
40        for (int i = 3; i * i <= num; i += 2) {
41            if (num % i == 0) return false;
42        }
43
44        return true;
45    }
46}
47