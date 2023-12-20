import java.util.Scanner;
class sumOfNumbersInARange {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter start range: ");
            int lower = sc.nextInt();
            System.out.print("enter end range: ");
            int upper = sc.nextInt();
            int temp1 = lower;
            int temp2=upper;
            int sum = 0;
            while (temp2 >= temp1) {
                sum = sum + temp2;
                temp2--;
            }
            System.out.println("sum of number is " + sum);
        }
    }
}
