// Last updated: 11/8/2026, 11:04:20 pm
1class Solution {
2    public int missingInteger(int[] nums) {
3    HashSet<Integer>st=new HashSet<>();
4    for(int i:nums){
5        st.add(i);
6    }
7    int sum=nums[0];
8    for(int i=1;i<nums.length;i++){
9        if(nums[i]==nums[i-1]+1){
10            sum+=nums[i];
11        }
12        else{
13            break;
14        }
15    }
16    // return sum;
17    while(st.contains(sum)){
18        sum++;
19    }
20    return sum;
21    }
22}