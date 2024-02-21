package easy;

public class DayoftheWeek {

    public static void main(String args[]){
       int day=31;
       int month=8;
       int year=2019;

       String answer=dayOfTheWeek(day,month,year);
       System.out.println(answer);
    }

    //contrainst is year is calculated from 1971 to 2100
    private static String dayOfTheWeek(int day, int month, int year) {
        String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int months[]={0,31,28,31,30,31,30,31,31,30,31,30,31};

        int sum=4; //Indicate the gap between the 1st day of 1971 <- Thurday (1/1/1971) and the index of array days[]

        //checking number of years before the current year
        for(int i=1971;i<year;i++){
            //to check whether year is leap year or not
            if(i%4==0)
                sum=sum+366;
            else
                sum=sum+365;
        }

        //checking month
        for(int i=1;i<month;i++){
            //checking if leap year then increasing the day by 1
           if(i==2 &&((year%4==0 && year%100!=0) || year %400==0))
               sum++;
           sum=sum+months[i];
        }

        //for calculating day
        sum=sum+day;

        //return the day
        return days[sum%7];
    }
}
