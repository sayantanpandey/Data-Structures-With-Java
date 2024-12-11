class subArray{
    public static void main(String args[]){
        int ar[]={-2,-3,4,-1,-2,1,5,-3};
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            int sum=0;
            for(int j=i;j<ar.length;j++){
                sum=sum+ar[j];
                maxi=Math.max(sum,maxi);
            }
        }
        System.out.println(maxi);
    }
}