import java.util.* ;
import java.io.*; 
class Solution {
    public static int floor(int n, int x, int[] arr) {
        // Write your code here.
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+((high-low)/2);
            if(arr[mid]==x){
                return arr[mid];
            }
            else if(arr[mid]<=x){
                ans=arr[mid];
                low=mid+1;
            } else  {
                high = mid -1;
            }
        }
        return ans;
    }

    public static int ceil(int n, int x, int[] arr) {
        // Write your code here.
        int low=0;
        int high=n-1;
        int ans2=-1;
        while(low<=high){
            int mid=low+((high-low)/2);
            if(arr[mid]==x){
                return arr[mid];
            }
            else if(arr[mid]>=x){
                ans2=arr[mid];
                high=mid-1;
            } else  {
                low = mid +1;
            }
        }
        return ans2;
    }
    
    public static int[] getFloorAndCeil(int[] a, int n, int x) {

        int celi = ceil(n, x, a);

        int floor = floor(n, x, a);

        int sol[] = new int[2];//array of size 2 has been created to store the value of floor and celi 

        sol[0] = floor;

        sol[1] = celi;

        return sol;

    }
}