package easy;

public class RectangleOverlap {

    public static void main(String args[]){
        int rec1[]={0,0,2,2};
        int rec2[]={1,1,3,3};
        boolean answer=isRectangleOverlap(rec1,rec2);
        System.out.println(answer);
    }

    private static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean check=false;
        int x1=rec1[0];
        int y1=rec1[1];
        int x2=rec1[2];
        int y2=rec1[3];

        int a1=rec2[0];
        int b1=rec2[1];
        int a2=rec2[2];
        int b2=rec2[3];

       // if(x2<=a1 || y2<=b1 || x1>=a2 || y1>=b2){
        if(b1>=y2 || y1>=b2 || a1>=x2 || x1>=a2){
            check=false;
        }else{
            check=true;
        }
        return check;
    }
}
