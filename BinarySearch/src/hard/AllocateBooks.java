package hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllocateBooks {

    public static void main(String args[]){
        List<Integer> arr=new ArrayList<>();
        arr.add(12);
        arr.add(34);
        arr.add(67);
        arr.add(90);
        int m=2;
        int n=arr.size();
        int answer=findPages(arr,n,m);
        System.out.println(answer);
    }

    private static int findPages(List<Integer> arr, int n, int m) {
        // book allocation impossible
        if (m > n)
            return -1;
//        int low = Collections.max(arr);
//        int high = arr.stream().mapToInt(Integer::intValue).sum();
        int low=0;
        int high=0;

        for(Integer a:arr){
            low=Math.max(low,a);
            high=high+a;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int students=allocateStudents(arr,n,mid);
            if(students>m)
                low=mid+1;
            else
                high=mid-1;
        }
        return low;
    }

    private static int allocateStudents(List<Integer> arr, int n, int mid) {
        int stud=1;
        int pages=0;
        for(int i=0;i<n;i++){
            if(pages+arr.get(i)<=mid){
                pages=pages+arr.get(i);
            }else{
                stud++;
                pages=arr.get(i);
            }
        }
        return stud;
    }

}
