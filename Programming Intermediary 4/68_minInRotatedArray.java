
class Solution {
    public static int findMin(int []ar) {
        // Write your code here.
        int low=0;
        int high= ar.length-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+((high-low)/2);
            if(ar[low]<=ar[mid]){
                min=Math.min(min,ar[low]);
                low=mid+1;
            }
            else{
                min=Math.min(min,ar[mid]);
                high=mid-1;
            }
        }
        return min;
    }
    public static void main(String args[]){
        int ar[]={7,8,9,1,2,3,4,5,6};
        int res=findMin(ar);
        System.out.println(res);
    }
}