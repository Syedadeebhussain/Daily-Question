// Last updated: 10/11/2025, 6:48:42 pm
class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,List<Integer>> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],new ArrayList<>());
            }
            mp.get(nums[i]).add(i);
        }
        int min=Integer.MAX_VALUE;
        for(List<Integer> ll:mp.values()){
            if(ll.size()<3){
                continue;
            }
            for(int i=0;i+2<ll.size();i++){
                int d=2*(ll.get(i+2)-ll.get(i));
                min=Math.min(d,min);
            }
        }
        return min!=Integer.MAX_VALUE?min:-1;
    }
}