class SumProblem {
    public static void main(String args[]){
        int ar[]={2,6,5,8,11};
        int k=16;
        if(check(ar,k)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static boolean check(int ar[],int k){
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]+ar[j]==k){
                    return true;
                }
            }
        }
        return false;
    }
}
