// Last updated: 5/2/2026, 7:33:25 pm
1import java.util.*;
2
3class MedianFinder {
4    PriorityQueue<Integer> small; // max heap (left half)
5    PriorityQueue<Integer> large; // min heap (right half)
6    public MedianFinder() {
7        small = new PriorityQueue<>(Collections.reverseOrder());
8        large = new PriorityQueue<>();
9    }
10    public void addNum(int num) {
11        small.add(num);// we are adding this because we dont know whether the number is small or large basically this is the way of checkin
12        large.add(small.poll());
13        if (large.size() > small.size() + 1) {
14            small.offer(large.poll());
15        }
16    }
17
18    public double findMedian() {
19        if (large.size() > small.size()) {
20            return large.peek();
21        }
22        return (small.peek() + large.peek()) / 2.0;
23    }
24}
25