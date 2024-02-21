package medium;

import java.util.Arrays;

public class BoatstoSavePeople {

    public static void main(String args[]){
        int[] people={3,2,2,1};
        int limit=3;
        int answer=numRescueBoats(people,limit);
        System.out.println(answer);
    }

    private static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people); //1,2,2,3
        int count=0;
        int i=0;
        int j=people.length-1;
        while(i<=j){
            if(people[i]+people[j]<=limit) {
                i++;
                count++;
            }else{
                count++;
            }
            j--;
        }
        return count;
    }
}
