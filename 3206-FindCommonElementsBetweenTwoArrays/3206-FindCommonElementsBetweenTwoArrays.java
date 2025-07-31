// Last updated: 31/7/2025, 2:22:01 pm
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int answer1=find(nums1,nums2);
        int answer2=find(nums2,nums1);
        int [] arr={answer1,answer2};
        return arr;
    }
    public int find(int []arr1,int[] arr2){
        int c=0;
        for(int i=0;i<arr1.length;i++){
               for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    c++;
                    break;
                }
                
        }

    }
  return c;
}
}