class secondApproach {
    public static void main(String args[]){
        int ar[]={1,1,2,3,3,4,4};
        int xor=0;
        for(int i=0;i<ar.length;i++){
            xor=xor^ar[i];
        }
        System.out.println(xor);
    }    
}
