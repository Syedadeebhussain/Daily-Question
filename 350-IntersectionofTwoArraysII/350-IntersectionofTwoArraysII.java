// Last updated: 24/8/2025, 9:02:05 am
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       List<Integer> ll=new ArrayList<>();
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int num:nums1){
        if(map.containsKey(num)){
            map.put(num,map.get(num)+1);
        }
        else{
              map.put(num,1);
        }
       } 
       for(int num2:nums2){
        if(map.containsKey(num2) && map.get(num2)>0){
            ll.add(num2);
            map.put(num2,map.get(num2)-1);
        }

       }
       int [] ans=new int[ll.size()];
       for(int i=0;i<ans.length;i++){
        ans[i]=ll.get(i);
       }
       return ans;
     }
}