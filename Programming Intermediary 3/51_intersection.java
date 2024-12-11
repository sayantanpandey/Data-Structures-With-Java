import java.util.*;
class intersection {
    public static void main(String args[]){
        int ar[]={2,2,3,5,8};
        int ar2[]={3,5,9};

        Vector<Integer> vectorArray=new Vector<>();

    
        int i=0,j=0;
        while(i<ar.length && j<ar2.length){
            if(ar[i]<ar2[j]){
                i++;
            }
            else if(ar[i]>ar2[j]){
                j++;
            }
            else{
                vectorArray.add(ar[i]);
                i++;
                j++;
            }
        }
        for (int value : vectorArray) {
            System.out.print(value+" ");
        }
        
    }
}
