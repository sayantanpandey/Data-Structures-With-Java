class Solutions {
    public static int search(int arr[], int key) {
        // Write your code here.
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high){
            mid=low+((high-low)/2);
            if(arr[mid]==key){
                return mid;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=key && key<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<=key && key<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int ar[]={7,8,9,1,2,3,4,5,6};
        int res=search(ar, 1);
        System.out.println(res);
    }
}