package Assignment6;

public class ConstructorOverloading {
    public ConstructorOverloading(){
        this(2,6);
    }
    public ConstructorOverloading(int a,int b ){
        System.out.println("Overloaded Constructor Called");
        System.out.println("Received a,b"+" a ="+a+" b = "+b);

    }
    public static void main(String args[]){
        new ConstructorOverloading();
    }
}
