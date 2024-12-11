import java.util.*;

class smallestNumber {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the size of array ");
            int size = sc.nextInt();

            int ar[] = new int[size];

            System.out.println("enter the number ");
            for (int i = 0; i < size; i++) {
                ar[i] = sc.nextInt();
            }

            System.out.println("if array is ascending order press 1 : ");
            System.out.println("if array is descending order press 2 : ");
            System.out.println("else press 0 : ");
            int key = sc.nextInt();
            
            switch (key) {

                case 1:
                    System.out.println("the smallest number is " + ar[0]);
                    break;

                case 2:
                    System.out.println("the smallest number is " + ar[size - 1]);
                    break;

                default:
                    int res = smallest(ar);
                    System.out.print("the smallest number is " + res);
                    break;
            }
        }
    }

    public static int smallest(int ar[]) {
        int s = ar[0];

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < s) {
                s = ar[i];
            }
        }
        return s;
    }
}
