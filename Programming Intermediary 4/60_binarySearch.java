
class binarySearch {
    public static void main(String args[]) {
        int ar[] = { 1, 2, 3, 4, 5, 6 };
        int s = 5;
        if (search(ar, s)) {
            System.out.println("present");
        } else {
            System.out.println("not present");
        }

    }

    public static boolean search(int ar[], int s) {
        int i = 0;
        int j = ar.length-1;
        while (i <= j) {
            int mid = i + ((j - i)/ 2);
            if (ar[mid] == s) {
                return true;
            } else if (ar[mid] > s) {
                j = mid - 1;
            } else
                i = mid + 1;
        }
        return false;
    }
}
