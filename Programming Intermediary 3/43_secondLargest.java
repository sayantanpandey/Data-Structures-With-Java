import java.util.*;

class secondLargest {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the size of array ");
            int size = sc.nextInt();

            int ar[] = new int[size];

            for (int i = 0; i < size; i++) {
                ar[i] = sc.nextInt();
            }

            System.out.println("if array is ascending order press 1 : ");
            System.out.println("if array is descending order press 2 : ");
            System.out.println("else press 0 : ");
            int key = sc.nextInt();

            switch (key) {

                case 1:
                    System.out.println("the second largest number is " + ar[size - 2]);
                    break;

                case 2:
                    System.out.println("the second largest is " + ar[1]);
                    break;

                default:
                    int res = largest(ar);
                    System.out.print("the second largest is " + res);
                    break;
            }
        }

    }

    public static int largest(int ar[]) {
        int l = ar[0];

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > l) {
                l = ar[i];
            }
        }
        return secondLargestNumber(ar, l);
    }

    public static int secondLargestNumber(int ar[], int l) {
        int l2 = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < l  && ar[i] > l2) {
                l2 = ar[i];
            }
        }
        return l2;
    }
}
