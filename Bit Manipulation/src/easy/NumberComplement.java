package easy;

public class NumberComplement {

    public static void main(String args[]){
        int num=5;
        int answer=findComplement(num);
        System.out.println(answer);
    }

    private static int findComplement(int num) {

        return ~num & (Integer.highestOneBit(num)-1);
    }

    //need to check
    private static int findComplementLengthy(int num) {
        int temp=num;
        String s = "";
        while(temp!=0){
            if((temp&1)==1) s+="0";
            else s+="1";
            temp>>=1;
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        int ans = Integer.parseInt(new String(sb),2);
        return ans;
    }
}
