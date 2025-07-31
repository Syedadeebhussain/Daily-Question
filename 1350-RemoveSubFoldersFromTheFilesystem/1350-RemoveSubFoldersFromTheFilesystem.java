// Last updated: 31/7/2025, 2:24:50 pm
import java.util.*;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result = new ArrayList<>();
        for (String curr : folder) { 
    if (result.isEmpty() || !curr.startsWith(result.get(result.size() - 1) + "/"))   {
                result.add(curr);
            }
        }

        return result;
    }
}
