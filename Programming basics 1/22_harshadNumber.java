import java.util.Scanner;

class harshadNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number: ");
            int num = sc.nextInt();
            int sum = 0;
            int rem = 0;

            for (int i = num; i > 0;) {
                rem = i % 10;
                sum = sum + rem;
                i = i / 10;
            }
            if (num % sum == 0) {
                System.err.println("harshad Number");
            } else
                System.out.println("not harshad");
        }
    }
}
