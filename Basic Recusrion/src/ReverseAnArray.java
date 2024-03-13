import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        int answer[]=reverseArr(arr,0,arr.length-1);
        System.out.println(Arrays.toString(answer));
    }

    /*
    Using Recursion
    Time- O(n)
    Space-O(n)
     */
    private static int[] reverseArr(int[] arr,int i,int j) {
        if(i>=j)
            return arr;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reverseArr(arr,i+1,j-1);
        return arr;
    }
}
