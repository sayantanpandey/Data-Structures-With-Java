import java.util.*;

class hcfOfTwoNumbers {
    public static int highestCommonFactor(int n1, int n2) {
        int r = 1;
        for (int i = 1; i <= n1 || i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                r = i;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter first number ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number");
            int num2 = sc.nextInt();
            int result = 1;

            if (num1 > 0 || num2 > 0) {
                result = highestCommonFactor(num1, num2);
                System.out.print("highest common factor is " + result);
            } else
                System.out.print("Invalid number");
        }
    }
}
