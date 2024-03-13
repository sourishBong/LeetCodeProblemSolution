public class PrintallDivisorsofagivenNumber {

    public static void main(String args[]){
        int n=36;
        printDivisor(n);
    }

    private static void printDivisor(int n) {
//        for(int i=1;i<=Math.sqrt(n);i++){
//            if(n%i==0)
//                System.out.print(i+" ");
//            if(i != n/i) System.out.print(n/i + " ");
//        }
        //System.out.print(n);
        for(int i = 1; i <= (int)Math.sqrt(n); i++)
            if(n % i == 0){
                System.out.print(i + " ");
                if(i != n/i) System.out.print(n/i + " ");
            }
    }

    /*
    Using n/2 in loop
     */
    private static void printDivisorApproach1(int n) {

        System.out.print(1+" ");
        for(int i=2;i<(n/2);i++){
            if(n%i==0)
            System.out.print(i+" ");
        }
        System.out.print(n);
    }
}
