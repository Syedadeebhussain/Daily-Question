// Last updated: 31/7/2025, 2:25:46 pm
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> ll=new ArrayList<>();
       int [] arr=new int[nums.length+1];
       for(int i :nums)
       {
        arr[i]+=1;
       }
       for(int j=1;j<arr.length;j++)
       {
        if(arr[j]==2)
        {
            ll.add(j);
        }
       }
       return ll;
    }
}