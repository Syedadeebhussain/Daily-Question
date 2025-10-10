// Last updated: 10/10/2025, 9:28:16 am
class Solution {
    public List<Integer> intersection(int[][] nums) {
     int [] freq=new int [1001];
     List<Integer> ll=new ArrayList<>();
     for(int [] arr:nums){
        for(int i:arr){
            freq[i]++;
        }
     }
     for(int i=0;i<freq.length;i++){
        if(freq[i]==nums.length){
            ll.add(i);
        }
     }
     Collections.sort(ll);
     return ll;
    }
}