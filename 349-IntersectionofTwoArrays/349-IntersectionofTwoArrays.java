// Last updated: 24/8/2025, 9:15:11 am
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      // List<ArrayList>list=new ArrayList();
       Set<Integer>ans=new HashSet();
        Set<Integer>set=new HashSet();
        for(int x:nums1)
        set.add(x);
        for(int x:nums2){
            if(set.contains(x))
            ans.add(x);
        }
        int []arr=new int[ans.size()];
        int i=0;
        for(int a:ans){
                arr[i]=a;
                i++;
        }
        return arr;
    }
}