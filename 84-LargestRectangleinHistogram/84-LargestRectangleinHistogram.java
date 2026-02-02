// Last updated: 2/2/2026, 9:10:14 pm
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3    int n=heights.length;
4     int maxArea=0;
5      Stack<Integer> st=new Stack<>();
6      for(int i=0;i<=n;i++){
7        int curr=(i==n)?0:heights[i];
8        while(!st.isEmpty() && curr<heights[st.peek()]){
9            int height=heights[st.pop()];
10            int nse=i;
11            int pse=st.isEmpty()?-1:st.peek();
12            int width=nse-pse-1;
13            int area=height*width;
14            maxArea=Math.max(maxArea,area);
15        }
16        st.push(i);
17      }  
18      return maxArea;
19    }
20}