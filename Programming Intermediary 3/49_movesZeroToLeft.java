class movesZeroToLeft {
    public static void main(String args[]) {
        int ar[] = { 5, 6, 7, 8, 3, 0, 0, 2, 3, 0, 1 };
        int index = 0;
        int temp[] = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != 0) {
                if (temp[index] == 0) {
                    temp[index] = ar[i];
                    index++;
                }
            }
        }
        System.out.println("update");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]);
        }

    }
}
