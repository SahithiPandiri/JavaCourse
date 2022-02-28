package Assignment6;

public class ArrayOfObjects{
    ArrayOfObjects(String str){
        System.out.println("Initialization done");
        System.out.println("Received "+ str);
    }
    public static  void main(String args[]){
        ArrayOfObjects obj_array[]=new ArrayOfObjects[3];
        for(int i=0;i<3;i++){
            obj_array[i]=new ArrayOfObjects(String.valueOf(i));
        }
    }
}

