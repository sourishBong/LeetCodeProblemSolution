package Recusion.SchoolBasicEasy;

public class PrintPrint1ToNWithoutLoop {

    public static void main(String args[]){
        int n=10;
        print(n);
    }

    private static void print(int n) {
        if(n<1) return;

        print(n-1);
        System.out.println(n);

    }
}
