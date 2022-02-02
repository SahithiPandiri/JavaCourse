package Sahithi.Assignment.main;

import Sahithi.Assignment.Singleton.SingleTonExample;
import Sahithi.Assignment.data.DefaultInitialization;

public class MainClass {
    public static void main(String args[]) {
        DefaultInitialization di = new DefaultInitialization();
        di.printInstantVariables();
        di.printLocalVariables();
    }
        static void instantiatingSingleton(){
            SingleTonExample st= new SingleTonExample();
            st.toPrintString();
        }

}
