<<<<<<< HEAD
import java.util.Scanner;

class fibonnaci {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the nth term: ");
            int term = sc.nextInt();
            int firstTerm=1;
            int secondTerm=2;
            int nextTerm;

            System.out.println("fibonaaci series are : ");
            System.out.println(firstTerm);
            System.out.println(secondTerm);

            for(int i=2;i<term;i++){
                nextTerm=firstTerm+secondTerm;
                firstTerm=secondTerm;
                secondTerm=nextTerm;
                System.out.println(nextTerm);
            }
        }
    }
}
=======
import java.util.Scanner;

class fibonnaci {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the nth term: ");
            int term = sc.nextInt();
            int firstTerm=1;
            int secondTerm=2;
            int nextTerm;

            System.out.println("fibonaaci series are : ");
            System.out.println(firstTerm);
            System.out.println(secondTerm);

            for(int i=2;i<term;i++){
                nextTerm=firstTerm+secondTerm;
                firstTerm=secondTerm;
                secondTerm=nextTerm;
                System.out.println(nextTerm);
            }
        }
    }
}
>>>>>>> 3379224 (update)
