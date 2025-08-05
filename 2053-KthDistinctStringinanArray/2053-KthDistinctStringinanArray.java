// Last updated: 5/8/2025, 10:03:07 pm
class Solution {
    public String kthDistinct(String[] arr, int k) {
    HashMap<String, Integer> map = new HashMap<>(); 
    for (String num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
    }
    int c=0;
    for(String key :arr){
        if(map.get(key)==1){
            c++;
        }
        if(c==k){
            return key;
        }
    }
    return "";
    }
}