public class oddEven {

    /*
    If we do a Bitwise & 1 with the number we will get whether the number is odd or even
    because in binary number representation and odd number always gives 1.
    a & 1 = a and a & 0 =0;
     */
    public static void main(String args[]){
        int n=6;
        if((n&1)==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
