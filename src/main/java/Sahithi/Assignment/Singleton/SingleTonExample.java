package Sahithi.Assignment.Singleton;

public class SingleTonExample {
    String str;
    public static  SingleTonExample toInitializeString(String s){
        SingleTonExample obj= new SingleTonExample();
        obj.str=s;
        return obj;

    }
   public void toPrintString(){
        System.out.println(str);

    }
}
