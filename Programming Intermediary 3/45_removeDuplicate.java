import java.util.*;

class removeDuplicate {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of array ");
            int size = sc.nextInt();

            int ar[] = new int[size];
            System.out.println("enter the numbers");
            for (int i = 0; i < ar.length; i++) {
                ar[i] = sc.nextInt();
            }
            int res = duplicate(ar, size);
            System.out.print("updated array is ");
            for (int i = 0; i < res; i++) {
                System.out.println(ar[i]);
            }
        }

    }

    public static int duplicate(int ar[], int size) {
        Set<Integer> arSet = new HashSet<>();
        for (int i = 0; i < size; i++) {
            arSet.add(ar[i]);
        }

        int k = arSet.size();
        int index = 0;
        for (int it : arSet) {
            ar[index] = it;
            index++;
        }

        return k;
    }
}
