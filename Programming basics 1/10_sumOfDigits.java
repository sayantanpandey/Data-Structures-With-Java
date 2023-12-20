import java.util.Scanner;

class sum_of_digit {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter number: ");
            int num = sc.nextInt();
            int num2 = num;
            int sum = 0;

            for (int i = num2; i > 0; i--) {
                int rem = num % 10;
                sum = sum + rem;
                num = num / 10;
            }
            System.out.println("sum of digit is " + sum);
        }
    }
}
