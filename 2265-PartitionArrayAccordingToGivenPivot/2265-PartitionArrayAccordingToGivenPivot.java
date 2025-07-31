// Last updated: 31/7/2025, 2:23:18 pm
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       List<Integer> ans1=new ArrayList<>();
        List<Integer> ans2=new ArrayList<>();
         List<Integer> ans3=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                ans1.add(nums[i]);
            }
            else if(nums[i]==pivot){
                ans3.add(nums[i]);
            }
            else{
                ans2.add(nums[i]);
            }
        }
    //    Collections.sort(ans1, Collections.reverseOrder());
        // Collections.sort(ans2);
        ans1.addAll(ans3);
        ans1.addAll(ans2);
         int[] array = new int[ans1.size()];
        for (int i = 0; i < ans1.size(); i++) {
            array[i] = ans1.get(i);
        }
        return array;
    }
}