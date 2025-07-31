// Last updated: 31/7/2025, 2:21:24 pm
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
       boolean [] placed=new boolean[fruits.length];
       int c=0;
       for(int i=0;i<fruits.length;i++)
           {
             for(int j=0;j<baskets.length;j++)
                   {
               if(placed[j]==false &&  baskets[j]>=fruits[i])
                       {
                        placed[j]=true;
                           c++;
                           break;
                       }
                   }
           }
      return placed.length-c;
    }
}