// Last updated: 17/3/2026, 11:47:10 am
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3    int n=nums.length;
4    boolean[] visited=new boolean[n];
5    List<List<Integer>> ans=new ArrayList<>();
6    List<Integer> ll=new ArrayList<>();
7    find(nums,0,visited,ans,ll);
8    return ans;
9    }
10    public void find(int [] nums ,int idx,boolean [] visited, List<List<Integer>> ans,List<Integer> ll){
11        if(idx==nums.length){
12            ans.add(new ArrayList<>(ll));
13            return ;
14        }   
15        for(int i=0;i<=nums.length-1;i++){
16        if(!visited[i])
17        {
18         ll.add(nums[i]);
19         visited[i]=true;
20          find(nums,idx+1,visited,ans,ll);
21         visited[i]=false;
22         ll.remove(ll.size()-1);
23        }  
24     }
25    }
26}