package easy;

public class NumberofStepstoReduceaNumbertoZero {

    public static void main(String args[]){
        int num=14;
        int answer=numberOfSteps(num);
        System.out.println(answer);
    }

    private static int numberOfSteps(int num) {
        int count=0;
        while(num!=0){
            count++;
            if(num%2==0)
            num=num/2;
            else
                num=num-1;
        }
        return count;
    }
}
