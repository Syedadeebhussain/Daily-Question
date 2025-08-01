// Last updated: 31/7/2025, 2:26:36 pm
class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1=version1.split("\\.");
        String[] arr2=version2.split("\\.");
         int l=Math.max(arr1.length,arr2.length);
         for(int i=0;i<l;i++)
        {
            int num1=i<arr1.length?Integer.parseInt(arr1[i]):0;
            int num2=i<arr2.length?Integer.parseInt(arr2[i]):0;
            if(num1<num2)
            {
                return -1;
            }
            else if(num1>num2)
            {
                return 1;
            }
        }
        return 0;
    }
}