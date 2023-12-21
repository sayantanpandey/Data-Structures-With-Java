import java.util.Scanner;

class factor {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a number: ");
            int num=sc.nextInt();
            

            for(int i=1;i<=num;i++){
                if(num%i==0){
                    System.err.println(i);
                }
                
            }
        }
    }
}
