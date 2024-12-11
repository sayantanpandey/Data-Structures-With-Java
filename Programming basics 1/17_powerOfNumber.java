<<<<<<< HEAD
import java.util.Scanner;

class powerOfNumber {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a number: ");
            int base=sc.nextInt();
            System.out.print("enter the exponent: ");
            int expo=sc.nextInt();

            int result=base;
            while(expo>1){
                result=result*base;
                expo--;
            }
            System.err.println("the power number of "+base+" is "+result);
        }
    }
}
=======
import java.util.Scanner;

class powerOfNumber {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a number: ");
            int base=sc.nextInt();
            System.out.print("enter the exponent: ");
            int expo=sc.nextInt();

            int result=base;
            while(expo>1){
                result=result*base;
                expo--;
            }
            System.err.println("the power number of "+base+" is "+result);
        }
    }
}
>>>>>>> 3379224 (update)
