import java.util.*;
class linearSearch {
    public static void main(String args[]){
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("enter the size of array ");
            int size= sc.nextInt();
            int ar[]=new int[size];
            System.out.print("enter the elements ");
            for(int i=0;i<size;i++){
                ar[i]=sc.nextInt();
            }
            System.out.println("enter the number to search");
            int s=sc.nextInt();
            if(linear(ar,s)){
                System.out.print("element found");
            }
            else System.out.println("element not found");
        }
    }

    public static boolean linear(int[] ar,int s) {
        for(int i=0;i<ar.length;i++){
            if(ar[i]==s){
                return true;
            }
        }
        return false;
    }
}
