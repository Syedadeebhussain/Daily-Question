// Last updated: 31/7/2025, 2:27:11 pm
class Solution {
    public int maximalRectangle(char[][] matrix) {
    int[] arr = new int[matrix[0].length];
		int ans=0;
		for (int i = matrix.length - 1; i >= 0; i--) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == '1') {
					arr[j]++;
				} else {
					arr[j] = 0;
				}

			}
			ans=Math.max(ans, Largest_Rectangle(arr));
		}
		return ans;
	}

	public static int Largest_Rectangle(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int area = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;
				if (!st.isEmpty()) {
					int l = st.peek();
					area = Math.max(area, h * (r - l - 1));
				} else {
					area = Math.max(area, h * r);
				}
			}

			st.push(i);
		}
		int r = arr.length;
		while (!st.isEmpty()) {
			int h = arr[st.pop()];

			if (!st.isEmpty()) {
				int l = st.peek();
				area = Math.max(area, h * (r - l - 1));
			} else {
				area = Math.max(area, h * r);
			}
		}

		return area;
	}
}