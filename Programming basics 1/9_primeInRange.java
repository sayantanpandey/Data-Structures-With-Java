import java.util.Scanner;

class prime_range {

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter start range: ");
            int start = sc.nextInt();
            System.out.print("enter end range: ");
            int end = sc.nextInt();
            for (int i = start; i < end; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }
}
