import java.util.Scanner;

class automorphicNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number : ");
            int num = sc.nextInt();
            int sq = num * num;
            int temp = sq;
            int rem;
            int n = 10;
            boolean flag =false;

            while (temp > 0) {
                rem = sq % n;
                if (rem == num) {
                    flag=true;
                    break;
                }
                else {
                    temp = temp / 10;
                    n = n * 10; 
                }
            }
            if(flag==true){
                System.out.println(num+" is automorphic number");
            }
            else
            System.out.println(num+" is not automorphic number");
        }
    }
}
