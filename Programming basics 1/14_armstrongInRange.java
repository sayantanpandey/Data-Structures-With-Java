<<<<<<< HEAD
import java.util.Scanner;

class armstrong_in_range {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter start range: ");
            int start = sc.nextInt();
            System.out.print("enter end range: ");
            int end = sc.nextInt();
            System.out.println("Armstrong numbers are: ");
            for (int i = start; i <= end; i++) {
                isarmstrong(i);
                if (isarmstrong(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    private static boolean isarmstrong(int num) {
        int sum = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            sum = rem * rem * rem + sum;
            num = num / 10;
        }
        if (temp == sum) {
            return true;            
        }
        else{
           return false;
        }
        
    }
}
=======
import java.util.Scanner;

class armstrong_in_range {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter start range: ");
            int start = sc.nextInt();
            System.out.print("enter end range: ");
            int end = sc.nextInt();
            System.out.println("Armstrong numbers are: ");
            for (int i = start; i <= end; i++) {
                isarmstrong(i);
                if (isarmstrong(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    private static boolean isarmstrong(int num) {
        int sum = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            sum = rem * rem * rem + sum;
            num = num / 10;
        }
        if (temp == sum) {
            return true;            
        }
        else{
           return false;
        }
        
    }
}
>>>>>>> 3379224 (update)
