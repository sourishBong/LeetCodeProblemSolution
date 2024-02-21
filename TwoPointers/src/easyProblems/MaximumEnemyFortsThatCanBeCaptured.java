package easyProblems;

public class MaximumEnemyFortsThatCanBeCaptured {

    public static void main(String args[]){
        int forts[]={1,0,0,-1,0,0,0,0,1};
        int forts2[]={1,0,0,-1};
        int forts3[]={-1,0,-1,0,1,1,1,-1,-1,-1};
        int forts4[]={0,0,1,-1};
        int forts5[]={-1,-1,0,1,0,0,1,-1,1,0};
        int answer=captureForts(forts5);
        System.out.println(answer);
    }

    private static int captureForts(int[] forts) {
        int sum = 0;// for  calculating cumulative sum
        int ret = 0; // for returning the max string of zeros between -1 and 1
        int count = 0; // for counting and comparing string of zeros


        for(int i = 0 ; i < forts.length ; i++){

            if(forts[i] != 0) // counting starts and ends at non-zero fort
            {

                sum += forts[i]; // s counts the cumulative sum from the last non-zero fort
                if(sum == 0)
                    ret = Math.max(ret, count);// if s = 0, it means we are either at start or end, hence compare

                sum = forts[i];//cumulative sum resets to current value
                count = 0;//count resets at non-zero fort value

            }

            else
            {
                if(sum != 0)
                    count++; //count if we already encountered a non-zero fort

            }
        }
        return ret;
    }

    //solution not working
    private static int captureForts2(int[] forts) {
        int i=0;
        int j=forts.length-1;
        int count=0;
        int maxCount=0;
        while(i<j){
            if(forts[i]==-1 && forts[j]==-1){
                i++;
                j--;
            }else if(forts[j]==-1 || (forts[j]==1 && forts[j-1]!=0)) {
                j--;
            }else if(forts[i]!=-1){
                i++;
            }else{
                if(forts[j]==0 && j==forts.length-1){
                    j--;
                }else {
                    count++;
                    j--;
                }
            }
        }
        maxCount=Math.max(maxCount,count-1);
        count=0;
        i=0;
        j=forts.length-1;
        while(i<j){
            if(forts[i]==-1 && forts[j]==-1){
                i++;
                j--;
            }else if(forts[i]==-1 || (forts[i]==1 && forts[i+1]!=0)) {
                i++;
            }else if(forts[j]!=-1){
               j--;
            }else{
                if(forts[i]==0 && i==0){
                    i++;
                }else {
                    count++;
                    i++;
                }
            }
        }
        maxCount=Math.max(maxCount,count-1);
        return maxCount;
    }

    //using two loops but solution is not working for all cases
    private static int captureFortsUsingTwoLoops(int[] forts) {
        int i=0;
        int j=forts.length-1;
        int count=0;
        int maxCount=Integer.MIN_VALUE;
        while(forts[i]!=-1){
            if(forts[i]==0 && i==0)
                return 0;
            if(forts[i]==0)
          count++;
            i++;
        }
        maxCount=Math.max(maxCount,count);
        count=0;
        while(forts[j]!=-1){
            if(forts[j]==0 && j==forts.length-1)
                return 0;
            if(forts[j]==0)
                count++;
            j--;
        }
        maxCount=Math.max(maxCount,count);
        return maxCount;
    }
}
