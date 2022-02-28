package Assignment7;

public class MainClass extends Concreteclass implements ChildInterface {
    public void read(){
        System.out.println("Read Method Of Main Class");
    }
    public void show1(){
        System.out.println("show1 Method Of Main Class");

    }
   public  void print1(Interface1 i1){
       System.out.println("print1 Method Of Interface1");

    }
    public void show2(){

    }
    public void print2(Interface1 i2){
        System.out.println("print2 Method Of Interface2");
    }
    public void show3(){

    }
   public void print3(Interface1 i3){
       System.out.println("print3 Method Of Interface3");
   }
   public static void main(String args[]){
        MainClass obj1=new MainClass();
        obj1.print1(obj1);
       obj1.print2(obj1);
       obj1.print3(obj1);

   }

}
