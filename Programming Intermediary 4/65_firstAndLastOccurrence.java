import java.util.ArrayList;

class Solution {

    public static int first(int ar[], int s) {
        int i = 0;
        int j = ar.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = i + ((j - i) / 2);
            if (ar[mid] >= s) {
                ans = mid;
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return ans;
    }

    public static int last(int ar[], int s) {
        int i = 0;
        int j = ar.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = i + ((j - i) / 2);
            if (ar[mid] <= s) {
                ans = mid;
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return ans;
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Convert ArrayList to array
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = arr.get(i);
        }
        
        int flag = -1;
        for (int i = 0; i <= ar.length - 1; i++) {
            if (ar[i] == k) {
                flag = 1;
            }
        }

        if (flag == -1) {
            return new int[]{-1, -1};
        } else {
            int res = first(ar, k);
            int res2 = last(ar, k);

            int ar2[] = new int[2];
            ar2[0] = res;
            ar2[1] = res2;
            return ar2;
        }
    }
}
