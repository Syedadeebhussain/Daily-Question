// Last updated: 31/7/2025, 2:22:48 pm
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int match=0;
        // boolean [] visited=new boolean[players.length];
        int i=0,j=0;
        while(i<players.length && j<trainers.length){
                   if(players[i]<=trainers[j]){
                        match++;
                        i++;
                        j++;
                     }
                     else{
                        j++;
                     }
        }
        return match;
    }
}