

class findMissingElementInArray {
    public static void main(String args[]) {
        int ar[] = { 2, 3, 4, 5, 6 };
        int n = 6;
        if(ar.length<n) System.out.println("the missing element is "+findElement(ar, n));
        else System.out.println("no missing number");

    }

    public static int findElement(int ar[],int n){
        
        int c = 1;
        for (int i = 0; i < n - 1; i++) {
            if (c == ar[i]) {
                c++;
            } else {
                return c;
            }
        }
        return c;
    }
}
