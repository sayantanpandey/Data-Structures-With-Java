import java.util.*;

class replace0to1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a number ");
            int num = sc.nextInt();
            int[] ar = new int[30];
            int j = 0;
            while (num > 0) {
                int rem = num % 10;
                if (rem == 0) {
                    rem = 1;
                    ar[j] = rem;
                } else {
                    ar[j] = rem;
                }
                j++;
                num = num / 10;
            }
            System.out.print("the number is ");
            for (int i = j - 1; i >= 0; i--) {
                System.out.print(ar[i]);
            }
        }
    }
}
