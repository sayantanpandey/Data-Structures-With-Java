import java.util.*;
class areaOfCircle {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the radius ");
            float r=sc.nextInt();
            float res=(float) (3.14*r*r);
            System.out.print("the area of circle is "+res);
        }
    }
}
