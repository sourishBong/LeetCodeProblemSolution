package LoveBabbarSheet.Arrays;

//this is incorrect--will cehck later
public class Kthsmallestelement {

    public static void main(String args[]){
        int arr[]={7,10,4,3,20,15};
        int k=3;
        int l=0;
        int r=5;

        int answer=kthSmallest(arr,l,r,k);
        System.out.println(answer);
    }

    private static int kthSmallest(int[] arr, int l, int r, int k) {
        if (k > 0 && k <= r - l + 1)  {
           int partition = findPartition(arr, l, r);
           if (partition -l == k-1)
               return arr[partition];
            if (partition-l > k-1)
               return kthSmallest(arr, l, partition - 1, k);
          // if (partition - l > k - 1)
               return kthSmallest(arr, partition + 1, r, k-partition);
       }else{
            // If k is more than number of elements
            // in array
            return Integer.MAX_VALUE;
        }
    }
    private static int findPartition(int[] arr, int l, int r) {
        int i=l;
        //int j=r;
        int pivot=arr[l];
//
//        while(i<j){
//
//            while(arr[i]<=pivot && i<=r-1)
//                i++;
//
//            while(arr[j]>pivot && j>=l+1)
//                j--;
//
//            if(i<j)
//                swap(arr,i,j);
//        }
        int j = l;
        for (; j <= r - 1; j++) {
            if (arr[j] <= pivot) {
                swap(arr,i,j);

                i++;
            }
        }
//        swap(arr,j,l);
//        return j;
        swap(arr,i,r);
        return r;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
