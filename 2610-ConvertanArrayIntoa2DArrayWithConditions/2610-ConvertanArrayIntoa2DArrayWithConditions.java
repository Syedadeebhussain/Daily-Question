// Last updated: 24/9/2025, 9:49:54 pm
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else{
                mp.put(nums[i],1);
            }
        }
        int row=0;
        for(int i:mp.keySet()){
            row=Math.max(row,mp.get(i));
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<row;i++){
            List<Integer> ll=new ArrayList<>();
            for(int j:mp.keySet()){
                if(mp.get(j)!=0){
                    ll.add(j);
                    mp.put(j,mp.get(j)-1);
                }
            }
            ans.add(ll);
        }
         return ans;   
        }
    }
