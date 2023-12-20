import java.util.Scanner;
class sumOfNNaturalNumber {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter range: ");
            int num = sc.nextInt();
            int num2 = num;
            int sum = 0;
            while (num > 0) {
                sum = sum + num;
                num--;
            }
            System.out.println("sum of first " + num2 + " natural number is " + sum);
        }
    }
}
