package easy;

public class ExcelSheetColumnTitle {

    public static void main(String args[]){
        int columnNumber=28;
        String output=convertToTitle(columnNumber);
        System.out.println(output);
    }

    private static String convertToTitle(int columnNumber) {
        StringBuilder result=new StringBuilder();

        //ASCII of A-Z is from 65 -90;
        //ASCII of a-z is 97-122
        while(columnNumber!=0){
            columnNumber--;

            //dividing by 26 since excel sheet column number changes after 26 columns.
            int remainder=columnNumber%26;

            //taking the ASCII of column Number value
            char ch= (char) (remainder+'A');
            result=result.append(ch);
            columnNumber=columnNumber/26;

        }
        return String.valueOf(result.reverse());
    }
}
