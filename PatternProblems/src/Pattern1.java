public class Pattern1 {


    public static void main(String args[]){
        int n=5;
       // pattern1(n);
        //pattern2(n);
       // pattern3(n);
        //pattern4(n);
        //pattern5(n);
        //pattern6(n);
       // pattern7(n);
        //pattern8(n);
       // pattern9(n);
       // pattern10(n);
        //pattern11a(n);
        //pattern11b(n);
       // pattern12(n);
        //pattern13(n);
       // pattern14(n);
        //pattern15(n);
       // pattern16(n);
        //pattern17a(n);
       // pattern17b(n);
        //pattern18a(n);
        //pattern18b(n);
        //pattern19(n);
        //pattern20(n);
       // pattern21(n);
        pattern22(n);
    }

    /*
    4444444
    4333334
    4322234
    4321234
    4322234
    4333334
    4444444
     */
    private static void pattern22(int n) {
        //n=4;
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int bottom=(2*n-2)-i;
                int min=Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print(n-min);
            }
            System.out.println();
        }
    }


    /*
     ****
     *  *
     *  *
     ****
     */
    private static void pattern21(int n) {
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(i==0 || i==n-2 || j==0 || j==n-2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
     *        *
     **      **
     ***    ***
     ****  ****
     **********
     ****  ****
     ***    ***
     **      **
     *        *
     */
    private static void pattern20(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int k=2;
        for(int i=n;i>=1;i--){
            for(int j=i-1;j>=1;j--){
                System.out.print("*");
            }
            for(int j=0;j<k;j++){
                System.out.print(" ");
            }
            k=k+2;
            for(int j=i-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*
     **********
     ****  ****
     ***    ***
     **      **
     *        *
     *        *
     **      **
     ***    ***
     ****  ****
     **********
     */
    private static void pattern19(int n) {
        int k=0;
        for(int i=n;i>0;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=0;j<k;j++){
                System.out.print(" ");
            }
            k=k+2;
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*
        E
        DE
        CDE
        BCDE
        ABCDE
         */
    private static void pattern18b(int n) {
        int k=n;
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                char ch=(char) (k-1+'A');
                System.out.print(ch);
                k++;
            }
            k=k-i-2;
            System.out.println();
        }
    }

    /*
    5
    45
    345
    2345
    12345
     */
    private static void pattern18a(int n) {
        int k=n;
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(k);
                k++;
            }
            k=k-i-2;
            System.out.println();
        }
    }

    /*
      A
     ABA
    ABCBA
   ABCDCBA
     */
    private static void pattern17b(int n) {
        for(int i=1;i<=n-1;i++){
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                char ch= (char) (j-1+'A');
                System.out.print(ch);
            }
            for(int j=i-1;j>=1;j--){
                char ch= (char) (j-1+'A');
                System.out.print(ch);
            }
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
    1
   121
  12321
 1234321
     */
    private static void pattern17a(int n) {
        for(int i=1;i<=n-1;i++){
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
    A
    BB
    CCC
    DDDD
    EEEEE
     */
    private static void pattern16(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                char ch= (char) (i+'A');
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    /*
    ABCDE
    ABCD
    ABC
    AB
    A
     */
    private static void pattern15(int n) {
        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                char ch= (char) (j+'A');
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    /*
    A
    AB
    ABC
    ABCD
    ABCDE
     */
    private static void pattern14(int n) {
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                char ch= (char) (j+'A');
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    /*
    1
    23
    456
    78910
    1112131415
     */
    private static void pattern13(int n) {
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }


    /*
    1      1
    12    21
    123  321
    12344321
     */
    private static void pattern12(int n) {
        int k=2;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=n-i+k;j>0;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            k--;
            System.out.println();
        }
    }


    /* Pattern 11b
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
         */
    private static void pattern11b(int n) {
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
////                if(j%2==0)
////                    System.out.print(0);
////                else
//                    System.out.print(1);
                System.out.print(j%2);
            }
            System.out.println();
        }
    }


    /* Pattern 11a
   1
   10
   101
   1010
   10101
     */
    private static void pattern11a(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }

    /* Pattern 10
     *
     ***
     *****
     *******
     *********
     *******
     *****
     ***
     *
     */
    private static void pattern10(int n) {
        pattern2(n);
        for(int i=n-1;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* Pattern 9
         *
        ***
       *****
      *******
     *********
     *********
      *******
       *****
        ***
         *
     */
    private static void pattern9(int n) {
        pattern7(n);
        pattern8(n);
    }

    /* Pattern 8
     *********
      *******
       *****
        ***
         *
     */
    private static void pattern8(int n) {
        for(int i=n-1;i>=0;i--){
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=2*i+1;j>0;j--){
                System.out.print("*");
            }
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    /* Pattern 7
       *
      ***
     *****
    *******
   *********
     */
    private static void pattern7(int n) {
        for(int i=0;i<n;i++){
           for(int j=n-i-1;j>0;j--){
               System.out.print(" ");
           }
            for(int j=2*i+1;j>0;j--){
                System.out.print("*");
            }
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /* Pattern 6
     12345
     1234
     123
     12
     1
     */
    private static void pattern6(int n) {
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /* Pattern 5
     *****
     ****
     ***
     **
     *
     */
    private static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* Pattern 4
     1
     22
     333
     4444
     55555
     */
    private static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /* Pattern 3
     1
     12
     123
     1234
     12345
     */
    private static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /* Pattern 2
     *
     **
     ***
     ****
     *****
     */
    private static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* Pattern 1
     *****
     *****
     *****
     *****
     *****
     */
    private static void pattern1(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
