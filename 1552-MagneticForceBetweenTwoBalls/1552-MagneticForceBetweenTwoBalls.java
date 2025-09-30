// Last updated: 30/9/2025, 11:11:29 pm
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int lo=0;
        int hi=position[position.length-1]-position[0];
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(ispossible(position,mid,m)){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
    public static boolean ispossible(int [] arr,int mid,int m){
        int pos=arr[0];
        int c=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-pos>=mid){
                pos=arr[i];
                c++;
            }
            if(c>=m){
                return true;
            }
        }
        return false;
    }
}