package Sahithi.Assignment.data;

public class DefaultInitialization {
    int var;
    char character;
    public void printInstantVariables(){
        System.out.println(var);
        System.out.println(character);
    }
    public void printLocalVariables(){
        int a,b;
        //System.out.println(a);
        System.out.println("local variables should be initialized before accessing");
    }


}
