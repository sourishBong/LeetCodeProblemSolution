package medium;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {

    public static void main(String args[]){

        int asteroids[]={5,10,-5};
        int ans[]=asteroidCollision(asteroids);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            while(!st.isEmpty() && st.peek()>0 && asteroids[i]<0){
                int sum=st.peek()+asteroids[i];
                if(sum>0){
                    asteroids[i]=0;
                }else if(sum<0){
                    st.pop();
                }else{
                    st.pop();
                    asteroids[i]=0;
                }
            }
            if(asteroids[i]!=0)
            st.push(asteroids[i]);
        }
        int result[]=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            result[i]=st.pop();
        }
        return result;
    }
}
