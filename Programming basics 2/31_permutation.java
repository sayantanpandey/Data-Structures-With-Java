import java.util.*;

class permutation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number of peoples ");
            int peoples = sc.nextInt();
            System.out.print("enter number of seats ");
            int seat = sc.nextInt();

            int res = fact(peoples) / fact(peoples - seat);
            System.out.print(res);
        }
    }

    public static int fact(int n) {
        int f = 1;
        if (n == 0) {
            return 1;
        } else {
            while (n > 0) {
                f = f * n;
                n--;
            }
            return f;
        }
    }
}
