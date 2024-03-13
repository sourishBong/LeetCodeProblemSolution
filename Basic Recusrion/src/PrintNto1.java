public class PrintNto1 {

    public static void main(String args[]){
        int n=10;
        printNto1(n,1);
    }

    private static void printNto1(int n, int i) {
        if(n<i)
            return;
        System.out.println(n);
        printNto1(n-1,i);
    }
}
