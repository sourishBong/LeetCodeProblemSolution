public class PrintNameNTimes {

    public static void main(String args[]){
      //  int n=1;
       // printName(n);
        int n=4;
        printName2(1,n);
    }

    //Approach 2
    // Time- O(n) <-called N times
    // Space- O(n) <- called N times
    private static void printName2(int i, int n) {
        if(i>n)
            return;
        System.out.println("Sourish");
        printName2(i+1,n);
    }

    //Approach 1
    private static void printName(int n) {
        if(n==4)
            return;
        System.out.println("Sourish");
        n++;
        printName(n);
    }
}
