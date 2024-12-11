class sort012 {
    public static void main(String args[]) {
        int ar[] = { 0, 2, 1, 0, 2, 2, 1, 1 };
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                a++;
            } else if (ar[i] == 1) {
                b++;
            } else
                c++;
        }
        for (int i = 0; i < a; i++) {
            ar[i] = 0;
        }
        for (int i = a; i < a + b; i++) {
            ar[i] = 1;
        }
        for (int i = a + b; i < ar.length; i++) {
            ar[i] = 2;
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
