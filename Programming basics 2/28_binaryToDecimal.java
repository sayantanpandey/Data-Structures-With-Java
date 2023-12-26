import java.util.*;

class binaryToDecimal {
    public static int btd(int n) {
        int i = 0;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * power(2,i);
            
            i++;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number ");
            int num = sc.nextInt();
            int result = btd(num);
            System.out.print("decimal is " + result);
        }
    }

    public static int power(int base,int power) {
        int res=1;
        if (power == 0) {
            return 1;
        } else {
            while (power > 0) {
                res = res * base;
                power--;
            }
        }
        return res;
    }
}
