// Last updated: 31/7/2025, 2:23:59 pm
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index=2;
        if(ruleKey.equals("type")){
            index=0;
        }
        else if(ruleKey.equals("color")){
            index=1;
        }
        int c=0;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(index).equals(ruleValue)){
                c++;
            }
        }
       return c;
    }
}