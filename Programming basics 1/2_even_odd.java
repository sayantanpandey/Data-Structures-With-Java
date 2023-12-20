import java.util.*;
class even_odd {
  public static void main(String[] args) {
    
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter number: ");
        int num = sc.nextInt();
        //checking the coditions if the number is odd or even
        if(num%2==0) System.out.println(num+" is even number");
        else System.out.println(num+" is odd number");
    }
  }
}