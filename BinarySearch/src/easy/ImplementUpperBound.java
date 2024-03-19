package easy;

public class ImplementUpperBound {

    public static void main(String args[]){
        int []arr={1,4,7,8,10};
        int x=7;
        int n=arr.length;
        int answer=upperBound(arr,x,n);
        System.out.println(answer);
    }

    private static int upperBound(int[] arr, int x, int n) {
        int low=0;
        int high=n-1;
        int answer=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(x<arr[mid]){
                answer=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return answer;
    }
}
