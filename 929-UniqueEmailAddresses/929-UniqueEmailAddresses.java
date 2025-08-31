// Last updated: 31/8/2025, 8:34:06 pm
import java.util.*;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> st1 = new HashSet<>();
        
        for (String s : emails) {
            String[] parts = s.split("@");
            String local = parts[0];
            String domain = parts[1];
            local = local.replace(".", "");
            int idx=local.indexOf("+");
            if(idx!=-1){
                 local=local.substring(0,idx);
            }
            String ans = local + "@" + domain;
            st1.add(ans);
        }
        
        return st1.size();
    }
}
