// Last updated: 9/9/2025, 3:41:07 pm
class Solution {
    public int heightChecker(int[] heights) {
    int[] arr = Arrays.copyOf(heights, heights.length); 
    Arrays.sort(arr); 
    int c=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=heights[i]) c++;
    } 
    return c;
    }
}