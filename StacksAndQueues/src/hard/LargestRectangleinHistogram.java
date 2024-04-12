package hard;

import java.util.Stack;

public class LargestRectangleinHistogram {

    public static void main(String args[]){
        int heights[]={2,1,5,6,2,3};
        int answer=largestRectangleArea(heights);
        System.out.println(answer);
    }

    //with stack
    private static int largestRectangleArea(int[] heights) {
        int right[]=new int[heights.length];
        int left[]=new int[heights.length];
        Stack<Integer> st=new Stack<>();

        //for left
        for(int i=0;i< heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }

            if(st.isEmpty())
                left[i]=0;
            else
                //for left add +1
                left[i]=st.peek()+1;
            st.push(i);
        }

        st.clear();

        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }

            if(st.isEmpty())
                right[i]=heights.length-1;
            else
                //for right add -1
                right[i]=st.peek()-1;
            st.push(i);
        }
        int ans=0;
        for(int i=0;i<heights.length;i++){
            ans=Math.max(ans,heights[i]*(right[i]-left[i]+1));
        }
        return ans;
    }

    //without stack
    public static int largestRectangleAreaWithOutStack(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int[] lessFromLeft = new int[height.length]; // idx of the first bar the left that is lower than current
        int[] lessFromRight = new int[height.length]; // idx of the first bar the right that is lower than current
        lessFromRight[height.length - 1] = height.length;
        lessFromLeft[0] = -1;

        for (int i = 1; i < height.length; i++) {
            int p = i - 1;

            while (p >= 0 && height[p] >= height[i]) {
                p = lessFromLeft[p];
            }
            lessFromLeft[i] = p;
        }

        for (int i = height.length - 2; i >= 0; i--) {
            int p = i + 1;

            while (p < height.length && height[p] >= height[i]) {
                p = lessFromRight[p];
            }
            lessFromRight[i] = p;
        }

        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            maxArea = Math.max(maxArea, height[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
        }

        return maxArea;
    }
}
