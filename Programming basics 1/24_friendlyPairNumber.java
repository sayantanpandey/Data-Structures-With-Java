<<<<<<< HEAD
import java.util.Scanner;

class friendlyPairNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("enter the second number: ");
            int num2 = sc.nextInt();
            if (divisor(num1) == divisor(num2)) {
                System.out.println(num1+"and"+num2+" is Friendly pair");
            } else
                System.out.println(num1+" and "+num2+" is not friendly pair");
        }
    }

    public static int divisor(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s = s + i;
            }
        }
        int d = s / n;
        return d;

    }
}
=======
import java.util.Scanner;

class friendlyPairNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("enter the second number: ");
            int num2 = sc.nextInt();
            if (divisor(num1) == divisor(num2)) {
                System.out.println(num1+"and"+num2+" is Friendly pair");
            } else
                System.out.println(num1+" and "+num2+" is not friendly pair");
        }
    }

    public static int divisor(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s = s + i;
            }
        }
        int d = s / n;
        return d;

    }
}
>>>>>>> 3379224 (update)
