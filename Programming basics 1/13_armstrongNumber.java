<<<<<<< HEAD
import java.util.Scanner;

class armstrongNumber {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter number: ");
            int num = sc.nextInt();
            int temp=num;
            int sum = 0;

            while(num>0) {
                int rem = num % 10;
                sum=rem*rem*rem+sum;
                num = num / 10;
            }
            if (temp==sum) {
                System.out.println(temp+" is Armstrong");
            }
            else
            System.out.println(temp+" is not an Armstrong");
        }
    }
}
=======
import java.util.Scanner;

class armstrongNumber {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter number: ");
            int num = sc.nextInt();
            int temp=num;
            int sum = 0;

            while(num>0) {
                int rem = num % 10;
                sum=rem*rem*rem+sum;
                num = num / 10;
            }
            if (temp==sum) {
                System.out.println(temp+" is Armstrong");
            }
            else
            System.out.println(temp+" is not an Armstrong");
        }
    }
}
>>>>>>> 3379224 (update)
