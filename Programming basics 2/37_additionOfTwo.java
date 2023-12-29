import java.util.*;

class addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first n");
        int n1 = sc.nextInt();
        System.out.print("enter first d");
        int d1 = sc.nextInt();
        System.out.print("enter second n");
        int n2 = sc.nextInt();
        System.out.print("enter second d");
        int d2 = sc.nextInt();
        float res;
        float lcm = lcm(d1, d2);
        float sum = ((n1 * (lcm / d1)) + (n2 * (lcm / d2)));
        res = sum / lcm;
        System.out.print("the sum of " + n1 + "/" + d1 + " and " + n2 + "/" + d2 + " is " + res);

    }

    public static float lcm(int d1, int d2) {
        float res=d1 * d2 / gcd(d1, d2);
        return res;
    }

    public static int gcd(int d1, int d2) {
        int r = 1;
        for (int i = 1; i <= d1 || i <= d2; i++) {
            if (d1 % i == 0 && d2 % i == 0) {
                r = i;
            }
        }
        return r;
    }
}