class insertPosition {
    public static void main(String args[]) {
        int ar[] = { 1, 2, 3,4, 4,5, 6 };
        int s = 5;
        int res = search(ar, s);
            System.out.println("inserted at position "+res);

    }

    public static int search(int ar[], int s) {
        int i = 0;
        int j = ar.length - 1;
        int ans=-1;
        while (i <= j) {
            int mid = i + ((j - i) / 2);
            if (ar[mid] >= s) {
                ans=mid;
                j=mid-1;
            } else if (ar[mid] < s) {
                i = mid + 1;
            } else
                j = mid - 1;

        }
        return ans;
    }
}
