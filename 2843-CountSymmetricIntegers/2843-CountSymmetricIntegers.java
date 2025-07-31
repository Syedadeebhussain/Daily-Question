// Last updated: 31/7/2025, 9:17:43 pm
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for(int i = low ; i <= high; i++)
        {
            String str = Integer.toString(i);
            int size = str.length();

            if(size % 2 != 0 ) continue;

            int half = size / 2;

            int leftSum = 0, rightSum = 0;

            for(int j = 0; j< half ; j++)
            {
                leftSum += str.charAt(j) - '0';
            }

            for(int k = half; k< size ; k++)
            {
                rightSum += str.charAt(k) - '0';
            }


            if(leftSum == rightSum)
                count++;
        }
        return count;
        

    }
}