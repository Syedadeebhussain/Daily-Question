// Last updated: 19/1/2026, 11:02:46 pm
1class Solution {
2    class Pair{
3        int val;
4        int death;
5        Pair(int val,int death){
6            this.val=val;
7            this.death=death;
8        }
9    }
10    public int totalSteps(int[] nums) {
11    int ans=0;
12     Stack<Pair> st=new Stack<>();
13     for(int i=0;i<nums.length;i++){
14        int steps=0;
15        while(!st.isEmpty() && st.peek().val<=nums[i]){
16            steps=Math.max(steps,st.peek().death);
17            st.pop();
18        }
19        if(st.isEmpty()){ //first element
20           steps=0;
21        }
22        else{
23            steps=steps+1;
24        }
25        ans=Math.max(ans,steps);
26        st.push(new Pair(nums[i],steps));
27     }
28     return ans;
29
30    }
31}