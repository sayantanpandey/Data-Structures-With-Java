<<<<<<< HEAD
import java.util.Scanner;

class prime {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            boolean flag=false;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println(n+" is not a prime number");
                    flag=true;
                    break;
                }
            }
            if (flag==false) {
                System.out.println(n+" is a prime number");
            }
             
        }
    }
}
=======
import java.util.Scanner;

class prime {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            boolean flag=false;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println(n+" is not a prime number");
                    flag=true;
                    break;
                }
            }
            if (flag==false) {
                System.out.println(n+" is a prime number");
            }
             
        }
    }
}
>>>>>>> 3379224 (update)
