

class Solution {
    public static int findKRotation(int[] ar) {
        int low = 0;
        int high = ar.length - 1;

        while (low <= high) {
            // If the array is already sorted, the minimum element is at index low
            if (ar[low] <= ar[high]) {
                return low;
            }

            int mid = low + (high - low) / 2;
            int next = (mid + 1) % ar.length; // To handle cases where mid is the last index

            // Check if mid is the minimum element
            if (ar[mid] <= ar[next] && ar[mid] <= ar[mid - 1]) {
                return mid;
            }

            // If the minimum element is in the right half, adjust the search space
            if (ar[mid] >= ar[low]) {
                low = mid + 1;
            }
            // If the minimum element is in the left half, adjust the search space
            else {
                high = mid - 1;
            }
        }

        return -1; // Not found
    }
    public static void main(String args[]){
        int ar[]={7,8,9,1,2,3,4,5,6};
        int res=findKRotation(ar);
        System.out.println(res);
    }
}
