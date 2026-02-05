// Last updated: 5/2/2026, 6:48:57 pm
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0], a[0]));
        
        for (int[] point: points) {
            int distance = point[0] * point[0] + point[1] * point[1];
            if (queue.size() < k) {
                queue.add(new int[]{distance, point[0], point[1]});
            } else {
                int[] currentHigh = queue.peek();
                if (currentHigh[0] > distance) {
                    queue.poll();
                    queue.add(new int[]{distance, point[0], point[1]});
                }
            }
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] current = queue.poll();
            result[i][0] = current[1];
            result[i][1] = current[2];
        }

        return result;
    }
}