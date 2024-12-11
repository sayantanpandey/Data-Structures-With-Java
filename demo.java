class a{
    public static void show(){
        System.out.print("this is class a");
    }    
    public static void print(){
        System.out.print("this is class a");
    }    
}
class b extends a{
    public static void show(){
        System.out.print("this is class b");

    }
}

class demo{
    public static void main(String [] args){
        // a obj= new b();
        // obj.show();
        a.show();
        b.show();
        b.print();
        
    }
}