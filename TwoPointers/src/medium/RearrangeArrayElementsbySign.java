package medium;

import java.util.Arrays;

public class RearrangeArrayElementsbySign {

    public static void main(String args[]){

        int nums[]={3,1,-2,-5,2,-4};
        int nums2[]={-1,1};
        int nums3[]={28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        int answer[]=rearrangeArray(nums3);
        System.out.println(Arrays.toString(answer));
    }

    //using 2 arrays to solve the problem
    private static int[] rearrangeArray(int[] nums) {
        int positiveNums[]=new int[nums.length/2];
        int negativeNums[]=new int[nums.length/2];
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positiveNums[k]=nums[i];
                k++;
            }else{
                negativeNums[j]=nums[i];
                j++;
            }
        }
       // System.out.println(Arrays.toString(positiveNums));
       // System.out.println(Arrays.toString(negativeNums));
        k=0;
        j=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=positiveNums[k];
                k++;
            }else{
                nums[i]=negativeNums[j];
                j++;
            }
        }
        return nums;
    }


    //Rubbish approach
    private static int[] rearrangeArrayTrialAppraoch(int[] nums) {
        int i=1;
        int j=2;
        int k=nums.length-1;
        while(i<k){
            if((i-1)==0 && nums[i-1]<0){
                int temp=nums[i-1];
                nums[i-1]=nums[i];
                nums[i]=temp;
                i++;
            }else if(nums[i-1]>0 && nums[i]>0 && nums[j]<0 && nums[j+1]<0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }else if(nums[i-1]<0 && nums[i]<0 && nums[j]>0 && nums[j+1]>0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }else{
                i++;
                j++;
            }
        }
        return nums;
    }


}
