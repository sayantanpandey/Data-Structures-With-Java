
import java.util.*;

class leftRotateDPlace {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter size of array");
            int size = sc.nextInt();
            int ar[] = new int[size];
            System.out.print("enter elements ");
            for (int i = 0; i < size; i++) {
                ar[i] = sc.nextInt();

            }

            System.out.print("enter the shift");
            int shift = sc.nextInt();

            while (shift > 0) {
                rotate(ar, size);
                shift--;
            }
            
            System.out.print("elements ar");
            for (int i = 0; i < size; i++) {
                System.out.println(ar[i]);

            }
        }

    }

    public static void rotate(int[] ar, int size) {
        int temp = ar[0];

        int index = 0;
        for (int i = 1; i < size; i++) {
            ar[index] = ar[i];
            index++;
        }
        ar[size - 1] = temp;

    }
}
