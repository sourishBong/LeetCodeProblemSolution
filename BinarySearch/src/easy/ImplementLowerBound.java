package easy;

public class ImplementLowerBound {

    public static void main(String args[]){
        int arr[]={1,2,2,3,3,5};
        int x=2;
        int n=arr.length;
        int answer=lowerBound(arr,n,x);
        System.out.println(answer);
    }

    private static int lowerBound(int[] arr, int n, int x) {
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(x<=arr[mid]){
                ans=mid;
                high=mid-1;
            }else if(x>arr[mid]){
                low=low+1;
            }
        }
        return ans;
    }
}
