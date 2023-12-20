import java.util.Scanner;

class greatestOfThree {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("enter second number: ");
            int num2 = sc.nextInt();
            System.out.print("enter third number: ");
            int num3 = sc.nextInt();
            if (num1 >= num2 && num1 >= num3) {
                System.out.println(num1 + " is greatest");
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println(num2 + " is greatest");
            } else if (num3 >= num1 && num3 >= num1){
                System.out.println(num3 + " is greatest");
            }
            else
                System.out.println("all are same");
        }
    }
}

