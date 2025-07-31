// Last updated: 31/7/2025, 2:23:06 pm
class Solution {
    public int countHillValley(int[] nums) {
        if(nums.length<3){
            return 0;
        }
    List<Integer> ll=new ArrayList<>();
    ll.add(nums[0]);
    for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            ll.add(nums[i]);
        }
    }
    int c=0;
    for(int i=1;i+1<ll.size();i++){
        if(ll.get(i-1)<ll.get(i) && ll.get(i+1)<ll.get(i)){
            c++;
        }
        else if(ll.get(i-1)>ll.get(i) && ll.get(i+1)>ll.get(i)){
            c++;
        }
    }
    return c;
    }
}