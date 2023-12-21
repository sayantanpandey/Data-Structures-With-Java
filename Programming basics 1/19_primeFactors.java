import java.util.Scanner;

class primeFactor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a number: ");
            int num = sc.nextInt();

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {     //
                    if (isPrime(i)) {   
                        if (i != 1) { 
                            System.out.println(i);
                        }
                    }
                }

            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
