package Assignment7;

public class SecondClass extends FirstClass{
   class SecondInnerClass extends FirstInnerClass {

        SecondInnerClass(){
            System.out.println("constructor of second inner class");
        }
    }
    public static void main(String args[]){
       SecondClass sc=new SecondClass();
        SecondClass.SecondInnerClass innerObject = sc.new SecondInnerClass();
    }
}
