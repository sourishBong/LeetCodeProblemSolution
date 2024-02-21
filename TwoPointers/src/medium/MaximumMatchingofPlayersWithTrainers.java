package medium;

import java.util.Arrays;

public class MaximumMatchingofPlayersWithTrainers {

    public static void main(String args[]){
        int player[]={4,7,9};
        int trainers[]={8,2,5,8};
        int answer=matchPlayersAndTrainers(player,trainers);
    }

    private static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int j=0;
        int count=0;

        while(i<players.length && j<trainers.length){
            if(players[i]<=trainers[j]){
                count++;
                i++;
                j++;
            }else if(players[i]>trainers[j])
                j++;
        }
        return count;
    }
}
