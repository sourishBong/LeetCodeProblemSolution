package HomeWork1;

public class FindValueWithOneOccurance {

    public static void main(String args[]){
        int arr[]={3,3,7,7,9,10,10,11,11};
        int answer=findSingleElement(arr);
        System.out.println(answer);
    }

    private static int findSingleElement(int[] arr) {
        int result=0;
        for(int i=0;i<arr.length;i++){
            result=result^arr[i];
        }
        return result;
    }
}
