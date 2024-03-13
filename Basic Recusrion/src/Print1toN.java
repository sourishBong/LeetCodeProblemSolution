public class Print1toN {

    public static void main(String args[]){
        int n=10;
        printN(1,n);
    }

    private static void printN(int i, int n) {
        if(i>n)
            return;
        System.out.println(i);
        printN(i+1,n);
    }
}
