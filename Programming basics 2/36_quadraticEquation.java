<<<<<<< HEAD
import java.util.*;

class quadratic {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the value of a ");
            int a = sc.nextInt();
            System.out.print("enter the value of b ");
            int b = sc.nextInt();
            System.out.print("enter the value of c ");
            int c = sc.nextInt();

            float n = (b * b) - (4 * a * c);
            float d = 2 * a;

            if (n < 0) {
                System.out.print("root 1 and root 2 is imaginary");
            } else if (n == 0) {
                System.out.print("root 1 and root 2 are equal value of " + (-b / d));
            } else {
                double x1 = (-b + Math.sqrt(n)) / d;
                double x2 = (-b - Math.sqrt(n)) / d;
                System.out.println("root 1 is " + x1);
                System.out.println("root 2 is " + x2);
            }
        }
    }
=======
import java.util.*;

class quadratic {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the value of a ");
            int a = sc.nextInt();
            System.out.print("enter the value of b ");
            int b = sc.nextInt();
            System.out.print("enter the value of c ");
            int c = sc.nextInt();

            float n = (b * b) - (4 * a * c);
            float d = 2 * a;

            if (n < 0) {
                System.out.print("root 1 and root 2 is imaginary");
            } else if (n == 0) {
                System.out.print("root 1 and root 2 are equal value of " + (-b / d));
            } else {
                double x1 = (-b + Math.sqrt(n)) / d;
                double x2 = (-b - Math.sqrt(n)) / d;
                System.out.println("root 1 is " + x1);
                System.out.println("root 2 is " + x2);
            }
        }
    }
>>>>>>> 3379224 (update)
}