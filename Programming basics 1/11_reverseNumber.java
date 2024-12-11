<<<<<<< HEAD
import java.util.Scanner;

class reverse {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter number: ");
            int num = sc.nextInt();
            int reverse = 0;

            while(num>0) {
                int rem = num % 10;
                reverse = reverse * 10 + rem;
                num = num / 10;
            }
            System.out.println("reverse of number is " + reverse);
        }
    }
}
=======
import java.util.Scanner;

class reverse {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter number: ");
            int num = sc.nextInt();
            int reverse = 0;

            while(num>0) {
                int rem = num % 10;
                reverse = reverse * 10 + rem;
                num = num / 10;
            }
            System.out.println("reverse of number is " + reverse);
        }
    }

}
>>>>>>> 3379224 (update)
