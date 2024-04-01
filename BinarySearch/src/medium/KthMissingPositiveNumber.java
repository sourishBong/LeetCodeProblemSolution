package medium;

public class KthMissingPositiveNumber {

    public static void main(String args[]){
        int arr[]={2,3,4,7,11};
        int k=5;
        int answer=findKthPositive(arr,k);
        System.out.println(answer);
    }

    private static int findKthPositive(int[] arr, int k) {
       // int missingNums[]=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            missingNums[i]=arr[i]-(i+1);
//        }
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missing=arr[mid]-mid-1;
            if(k>missing){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        int ans=k+high+1;
        return ans;
    }

    //brute force;
    private static int findKthPositiveBruteForce(int[] arr, int k) {
      //we will iterate and check if arr[i] is less than k.. if yes we will increase K by 1
       for(int i=0;i<arr.length;i++){
           if(arr[i]<=k)
               k++;
       }
       return k;
    }
}
