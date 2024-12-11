class greedyAlgo {
    public static void main(String args[]) {
        int ar[] = { 2, 5,6, 8, 11 };
        int k = 14;
        if (check(ar, k)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean check(int ar[],int k){
        int l=0;
        int j=ar.length-1;
        while(l<j){
            if(ar[l]+ar[j]==k){
                return true;
            }
            else if(ar[l]+ar[j]<k){
                l++;
            }
            else j--;

        }
        return false;
    }
}
