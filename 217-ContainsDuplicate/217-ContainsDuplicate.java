// Last updated: 31/7/2025, 2:26:21 pm
class Solution {
    public boolean containsDuplicate(int[] nums) {
        return find(nums);
    }
    public static boolean find(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++) 
        { 
            if(arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false; 
    }
}