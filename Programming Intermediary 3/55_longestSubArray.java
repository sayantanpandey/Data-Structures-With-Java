class longestSubArray {
    public static void main(String args[]) {
        int ar[] = { 1, 2, 3, 1, 1, 1, 4, 2, 3 };
        int k2 = 3;
        int len = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + ar[k];
                }
                if (sum == k2) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        System.out.println(len);
    }
}
