import java.util.*;
class consicutiveOne {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the size of array ");
            int size=sc.nextInt();
            int ar[]=new int[size];
            for(int i=0;i<size;i++){
                ar[i]=sc.nextInt();
            }
            int c=0;
            int maxi=0;
            for(int i=0;i<size;i++){
                if(ar[i]==1){
                    c++;
                }
                else c=0;
                maxi=Math.max(maxi,c);
            }

            System.out.println("the consicutive one are "+maxi);
        }
    }
}
