// Last updated: 31/7/2025, 2:22:27 pm
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int sum=0;
        for(int i=0;i<derived.length;i++){
                 sum^=derived[i];
          
        }
        if(sum==0){
            return true;
        }
        return false;
    }
}