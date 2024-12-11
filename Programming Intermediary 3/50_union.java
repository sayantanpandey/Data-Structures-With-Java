import java.util.*;

class union {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array");
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.print("enter size of array");
        int size2 = sc.nextInt();
        int ar2[] = new int[size2];

        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = sc.nextInt();
        }
        unionArray(ar, ar2);
    }

    // public static void input(int ar[]) {
    // Scanner sc=new Scanner(System.in);
    // for(int i=0;i<ar.length;i++){
    // ar[i]=sc.nextInt();
    // }
    // }

    public static void unionArray(int ar[], int ar2[]) {
        Set<Integer> setArray = new HashSet<>();
        for (int i = 0; i < ar.length; i++) {
            setArray.add(ar[i]);
        }
        for (int i = 0; i < ar2.length; i++) {
            setArray.add(ar2[i]);
        }

        int finalArray[] = new int[setArray.size()];
        int index = 0;
        for (int it : setArray) {
            finalArray[index] = it;
            index++;
        }

        System.out.println("final array is");
        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(" " + finalArray[i]);
        }
    }
}
