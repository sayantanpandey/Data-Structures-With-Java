
class appearOnce {
    public static void main(String args[]){
        int ar[]={1,1,2,3,3,4,4};
        appear(ar);
        
    }
    public static void appear(int ar[]){
        for(int i=0;i<ar.length;i++){
            int num=ar[i];
            int c=0;
            for(int j=0;j<ar.length;j++){
                if(ar[j]==num){
                    c++;
                }
            }
            if(c!=2){
                System.out.println(num+" appear once");
            }
        }
    }
    
}
