import java.util.Scanner;
class greatest_two {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("enter second number: ");
            int num2 = sc.nextInt();
            
            if (num1 > num2) {
                System.out.println(num1 + " is greatest");
            } else{
                System.out.println(num2 + " is greatest");
            }
        }
    }
}
