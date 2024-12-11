
import java.util.*;

class largestNumber {
    public static void main(String[] args) {
        int[] ar = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number ");
            for (int i = 0; i < ar.length; i++) {
                ar[i] = sc.nextInt();
            }
        }
        int res = largest(ar);
        System.out.print("largest number is " + res);
    }

    public static int largest(int[] arar) {
        int c = arar[0];
        for (int i = 1; i < arar.length; i++) {
            if (arar[i] > c) {
                c = arar[i];
            }
        }
        return c;
    }
}
