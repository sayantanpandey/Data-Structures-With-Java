<<<<<<< HEAD
import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter number: ");
            int num = sc.nextInt();
            int temp = num;
            int reverse = 0;

            while (num > 0) {
                int rem = num % 10;
                reverse = reverse * 10 + rem;
                num = num / 10;
            }
            if (temp == reverse) {
                System.out.println("number is palindrome");
            } else
                System.out.println("number is not palindrome");

        }
    }
=======
import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter number: ");
            int num = sc.nextInt();
            int temp = num;
            int reverse = 0;

            while (num > 0) {
                int rem = num % 10;
                reverse = reverse * 10 + rem;
                num = num / 10;
            }
            if (temp == reverse) {
                System.out.println("number is palindrome");
            } else
                System.out.println("number is not palindrome");

        }
    }
>>>>>>> 3379224 (update)
}