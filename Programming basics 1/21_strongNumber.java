<<<<<<< HEAD
import java.util.Scanner;

class strongNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a number");
            int num = sc.nextInt();
            int rem = 0;
            int sum = 0;
            int temp = num;

            for (int i = temp; i > 0;) {
                rem = i % 10;
                sum = sum + fact(rem);
                i = i / 10;
            }
            if (sum == num) {
                System.out.println("Strong Number");
            } else
                System.out.println("not strong number");
        }
    }

    public static int fact(int rem) {
        int fact = 1;
        for (int j = 1; j <= rem; j++) {
            fact = fact * j;
        }
        return fact;
    }
}
=======
import java.util.Scanner;

class strongNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a number");
            int num = sc.nextInt();
            int rem = 0;
            int sum = 0;
            int temp = num;

            for (int i = temp; i > 0;) {
                rem = i % 10;
                sum = sum + fact(rem);
                i = i / 10;
            }
            if (sum == num) {
                System.out.println("Strong Number");
            } else
                System.out.println("not strong number");
        }
    }

    public static int fact(int rem) {
        int fact = 1;
        for (int j = 1; j <= rem; j++) {
            fact = fact * j;
        }
        return fact;
    }
}
>>>>>>> 3379224 (update)
