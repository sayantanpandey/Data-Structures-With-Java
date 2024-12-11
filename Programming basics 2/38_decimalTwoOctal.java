<<<<<<< HEAD
import java.util.*;
class octal{
    public static void main(String[] args){
        int[] ar=new int[50];
        Scanner sc= new Scanner (System.in);
        System.out.print("enter a decimal value");
        int num=sc.nextInt();
        int j=0;

        while(num>0){
            int rem = num%8;
            ar[j]=rem;
            num=num/8;
            j++;
        }
        System.out.print("the octal number is ");
        for(int i=j-1;i>=0;i--){
            System.out.print(ar[i]);
        }
    }
=======
import java.util.*;
class octal{
    public static void main(String[] args){
        int[] ar=new int[50];
        Scanner sc= new Scanner (System.in);
        System.out.print("enter a decimal value");
        int num=sc.nextInt();
        int j=0;

        while(num>0){
            int rem = num%8;
            ar[j]=rem;
            num=num/8;
            j++;
        }
        System.out.print("the octal number is ");
        for(int i=j-1;i>=0;i--){
            System.out.print(ar[i]);
        }
    }
>>>>>>> 3379224 (update)
}