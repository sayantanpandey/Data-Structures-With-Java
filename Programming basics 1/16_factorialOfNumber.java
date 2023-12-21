import java.util.Scanner;

class factorialOfNumber {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a number: ");
            int num= sc.nextInt();
            int fact=1;

            for(int i=1;i<=num;i++){
                fact=fact *i;
            }
            System.out.print("factorial is "+fact);
        }
    }
    
}
