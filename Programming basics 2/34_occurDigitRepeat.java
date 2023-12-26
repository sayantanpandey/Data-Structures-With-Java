import java.util.*;
class digit{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a number ");
            int num=sc.nextInt();
            System.out.print("enter a digit ");
            int digit=sc.nextInt();
            int rem=0;
            int c=0;
            while(num>0){
                rem=num%10;
                if(rem==digit){
                    c++;
                }
                num=num/10;
            }
            if(c>0) System.out.print(c+" many times "+digit+" is present") ;
            else System.out.print(digit+" is not present");
        }
    }
}