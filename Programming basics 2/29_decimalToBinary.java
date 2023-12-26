import java.util.*;

class decimalToBinary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // int[] temp= new int[5];
            System.out.print("enter a number : ");
            int num = sc.nextInt();
            int rem;
            String temp = "";
            while (num > 0) {
                rem = num % 2;
                num = num / 2;
                temp = temp + String.valueOf(rem);
            }
            reverseNumber(temp);
        }
    }

    public static void reverseNumber(String temp) {
    int len=temp.length();
    while(len>0) {
        System.out.print(temp.charAt(len-1));
        len--;
    }
    System.out.print("");
    }
}
