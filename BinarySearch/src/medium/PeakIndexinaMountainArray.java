package medium;

public class PeakIndexinaMountainArray {

    public static void main(String args[]){
        int arr[]={0,2,1,0};
        int answer=peakIndexInMountainArray(arr);
        System.out.println(answer);
    }

    private static int peakIndexInMountainArray(int[] arr) {
        int left=0;
        int right=arr.length-1;

        while(left<right){
           // int mid=(left+right)/2;
            int mid=left+ (right-left)/2;
            if(arr[mid+1]>arr[mid])
                left=mid+1;
            else
                right=mid;

        }
        return left;
    }
}
