// Last updated: 27/9/2025, 3:10:05 pm
class Solution {
    public int[] sortEvenOdd(int[] nums) {
      List<Integer> ll=new ArrayList<>();
       List<Integer> ll1=new ArrayList<>();
        // int [] ans=new int [nums.length];
       for(int i=0;i<nums.length;i++){
        if(i%2==0){
            ll.add(nums[i]);
        }
        else{
            ll1.add(nums[i]);
        }
       }
        Collections.sort(ll1,Collections.reverseOrder());
        Collections.sort(ll);
        int p=0;
        int q=0;
        for(int i1=0;i1<nums.length;i1++){
            if(i1%2==0){
              nums[i1]=ll.get(p);
              p++;
            }
            else{
              nums[i1]=ll1.get(q);
              q++;
            }
        }
       return nums;
    }
}