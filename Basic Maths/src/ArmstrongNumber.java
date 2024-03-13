public class ArmstrongNumber {

    public static void main(String args[]){
        int n=1634;
        armstrong(n);
    }

    /*
    Brute Force approch
    Time- Order
     */
    private static void armstrong(int n) {
        int temp=n;
        int count=0;
        int res=0;
        int sum=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        temp=n;
        while(temp!=0){
            res= temp%10;
            sum= sum+(int)Math.pow(res,count);
            temp=temp/10;
        }
        if(sum==n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
