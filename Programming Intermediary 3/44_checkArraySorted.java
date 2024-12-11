
import java.util.*;

class checkArraySorted {
    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the size of array");
            int size = sc.nextInt();

            int ar[] = new int[size];
            System.out.print("enter the numbers ");
            for (int i = 0; i < size; i++) {
                ar[i] = sc.nextInt();
            }

            if (checkingSorted(ar)) {
                System.out.println("the array is sorted ");
            } else
                System.out.println("the array is not sorted ");
        }
    }

    public static boolean checkingSorted(int ar[]) {
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] > ar[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
