class majorityElements {
    public static void main(String args[]){
        int ar[]={2,2,6,4,8,2,2};
        
        for(int i=0;i<ar.length;i++){
            int c=0;
            for(int j=0;j<ar.length;j++){
                if (ar[i]==ar[j]) {
                    c++;
                }
            }
            if(c>(ar.length/2)){
                System.out.print(ar[i]);
                break;
            }
        }
    }
}
