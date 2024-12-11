<<<<<<< HEAD

import java.util.*;

class lcmOfTwoNumbers {
    public static int lcm(int n1, int n2) {
        int r = 1;
        int lcm = n1 * n2;
        for (int i = 1; i <= n1 || i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                r = i;
            }
        }
        lcm = (n1 * n2) / r;
        return lcm;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter first number ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number");
            int num2 = sc.nextInt();
            int result = 1;

            if (num1 > 0 || num2 > 0) {
                result = lcm(num1, num2);
                System.out.print("lcm is " + result);
            } else
                System.out.print("Invalid number");
        }
    }
}
=======

import java.util.*;

class lcmOfTwoNumbers {
    public static int lcm(int n1, int n2) {
        int r = 1;
        int lcm = n1 * n2;
        for (int i = 1; i <= n1 || i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                r = i;
            }
        }
        lcm = (n1 * n2) / r;
        return lcm;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter first number ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number");
            int num2 = sc.nextInt();
            int result = 1;

            if (num1 > 0 || num2 > 0) {
                result = lcm(num1, num2);
                System.out.print("lcm is " + result);
            } else
                System.out.print("Invalid number");
        }
    }
}
>>>>>>> 3379224 (update)
