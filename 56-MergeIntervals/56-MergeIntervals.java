// Last updated: 31/7/2025, 2:27:31 pm
class Solution {
    public int[][] merge(int[][] inputIntervals) {
        if (inputIntervals.length <= 1) {
            return inputIntervals;
        }

        Arrays.sort(inputIntervals, (first, second) -> Integer.compare(first[0], second[0]));
        List<int[]> resultList = new ArrayList<>();

        for (int[] currentInterval : inputIntervals) {
            if (resultList.isEmpty() || resultList.get(resultList.size() - 1)[1] < currentInterval[0]) {
                resultList.add(currentInterval);
            } else {
                resultList.get(resultList.size() - 1)[1] = 
                    Math.max(resultList.get(resultList.size() - 1)[1], currentInterval[1]);
            }
        }

        return resultList.toArray(new int[resultList.size()][]);
    }
}
