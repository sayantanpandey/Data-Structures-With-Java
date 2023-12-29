import java.util.Scanner;

class count{
    public static void main(String[] args){
        int[] daysArray= {31,28,31,30,31,30,31,31,30,31,30,31}; 
        String[] monthArray={"January","February","March","April","May","June","July","August","September","October","November","December"};
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a year ");
            int year=sc.nextInt();
            System.out.print("enter a month ");
            int month=sc.nextInt();

            if((year%400==0)||(year%4==0)&&(year%100!=0)&&(month==2)){
                System.out.print("the days in month "+monthArray[month-1]);
                System.out.print(" in "+year+" is "+(daysArray[month-1]+1));
            }
            else{
                System.out.print("the days in month "+monthArray[month-1]);
                System.out.print(" in "+year+" is "+daysArray[month-1]);
            }
        }
    }
}