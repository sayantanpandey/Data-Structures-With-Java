<<<<<<< HEAD
import java.util.Scanner;

class perfectNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number: ");
            int num= sc.nextInt();
            int sum=0;

            for(int i=1;i<num;i++){
                if(num%i==0){
                    sum=sum+i;
                }
            }
            if(sum==num){
                System.err.println("perfect number");
            }
            else
            System.out.println("not perfect number");
        }
    }
}
=======
import java.util.Scanner;

class perfectNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number: ");
            int num= sc.nextInt();
            int sum=0;

            for(int i=1;i<num;i++){
                if(num%i==0){
                    sum=sum+i;
                }
            }
            if(sum==num){
                System.err.println("perfect number");
            }
            else
            System.out.println("not perfect number");
        }
    }
}
>>>>>>> 3379224 (update)
