// Last updated: 18/10/2025, 7:58:07 am
class Solution {
    public int[] separateDigits(int[] nums) {
    List<Integer> ll=new ArrayList<>();
    for(int i:nums){
        find(i,ll);
    }  
    int [] arr=new int [ll.size()];
    for(int i=0;i<arr.length;i++){
        arr[i]=ll.get(i);
    }
    return arr;
    }
    public void find(int n,List<Integer> ll){
    String st = String.valueOf(n); 
    for (int i = 0; i < st.length(); i++) {
     ll.add(st.charAt(i) - '0');
    }

    }
}