import java.util.*;
class possitive {
  public static void main(String[] args) {
    
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println(num+" is a possitive number");
        }
        else if(num<0){
            System.out.println(num+" is a negative number");
        }
        else{
            System.out.println(num+" is zero");
        }
    }
  }
}