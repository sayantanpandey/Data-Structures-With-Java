import java.util.*;

class totalNoDigit {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number ");
            int num=sc.nextInt();
            int c=0;
            while(num>0){
                c++;
                num=num/10;
            }
            System.out.print(c);
        }
    }
}
