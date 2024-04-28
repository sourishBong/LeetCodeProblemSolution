package medium;

public class GasStation {

    public static void main(String args[]){
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};

        int answer=canCompleteCircuit(gas,cost);
        System.out.println(answer);
    }

    private static int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int total=0;
        int avail=0;
        int start=0;

        for(int i=0;i<n;i++){
            total=total+gas[i]-cost[i];
            avail=avail+gas[i]-cost[i];

            if(avail<0){
                avail=0;
                start=i+1;
            }
        }
        if(total<0)
            return -1;
        else
            return start;
    }
}
