import java.util.Scanner;

class leapYear {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter year: ");
            int year = sc.nextInt();
            if (year%400==0 || year%4==0 && year%100!=0) {
                System.out.println(year+ " is a leap year");
            }
            else System.out.println(year+ " is not a leap year");
        }
    }
}
