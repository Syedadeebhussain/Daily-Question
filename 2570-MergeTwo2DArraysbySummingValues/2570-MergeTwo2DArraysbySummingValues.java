// Last updated: 18/10/2025, 7:33:21 am
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
       
      TreeMap<Integer, Integer> mp = new TreeMap<>();
     for(int i=0;i<nums1.length;i++){
        mp.put(nums1[i][0],nums1[i][1]);
     }  
       for(int i=0;i<nums2.length;i++){
      mp.put(nums2[i][0], mp.getOrDefault(nums2[i][0], 0) + nums2[i][1]);
     }  
     
      int [][] arr=new int [mp.size()][2];
      int i=0; 
     for(int key:mp.keySet()){
    arr[i][0] = key;
    arr[i][1] = mp.get(key);
    i++;
     }
     return arr;
    }
}