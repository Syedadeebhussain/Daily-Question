// Last updated: 24/1/2026, 5:02:46 pm
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
15        // death = the round when X will be removed
16        while(!st.isEmpty() && st.peek().val<=nums[i]){
17            steps=Math.max(steps,st.peek().death);
18            st.pop();
19        }
20        if(st.isEmpty()){ //first element
21           steps=0;
22        }
23        else{
24            steps=steps+1;
25        }
26        ans=Math.max(ans,steps);
27        st.push(new Pair(nums[i],steps));
28     }
29     return ans;
30
31    }
32}