// Last updated: 31/7/2025, 8:06:07 pm
class Solution {
    public int pivotInteger(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        for(int i=1; i<n; i++)
        {
                answer[i] = (i+1) + answer[i-1];
        }

        if(n==1)
        {
            return 1;
        }

        for(int i=1; i<n; i++)
        {
            if(answer[i] == (answer[n-1]-answer[i-1]))
            return i+1;
        }

        return -1;
    }
}