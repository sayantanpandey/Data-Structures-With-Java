class value {
    public static boolean searchInARotatedSortedArrayII(int []arr, int key) {
        // Write your code here.
        int low=0;
        int high=arr.length-1;
        int mid=0;
        
        while(low<=high){
            mid=low+((high-low)/2);
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            if(arr[mid]==key){
                return true;
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
        return false;
    }
    public static void main(String args[]){
        int ar[]={3,1,2,3,3,3,3};
        if(searchInARotatedSortedArrayII(ar,3)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}