
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

    public static int count(int arr[], int x) {
        // Convert ArrayList to array
        int flag = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == x) {
                flag = 1;
            }
        }

        if (flag == 0) {
            return 0;
        } else {
            int res = first(arr,x);
            int res2 = last(arr,x);
            int res3=(res2-res)+1;
            return res3;
        }
    }
    public static void main(String args[]){
        int ar[]={7,8,9,1,2,2,2,3,4,5,6};
        int res=count(ar, 2);
        System.out.println(res);
    }
}
