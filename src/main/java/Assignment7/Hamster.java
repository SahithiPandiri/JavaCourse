package Assignment7;
class Rodent{
    Rodent(){
        System.out.println("This is Rodent Class ");
    }
    void show(){
        System.out.println("This is Rodent");
    }

}
class Mouse extends Rodent{
    Mouse() {
        System.out.println("This is Mouse Class ");
    }
    void show(){
        System.out.println("This is Mouse a kind of Rodent");
    }
}
class Gerbil extends  Mouse{
    Gerbil(){
        System.out.println("This is gerbil Class ");
    }
    void show(){
        System.out.println("This is Gerbil a kind of Mouse");
    }
}
public class Hamster extends Gerbil {
    Hamster(){
        System.out.println("This is Hamster Class");
    }
    void show(){
        System.out.println("This is Hamster a kind of Gerbil");
    }
    public static void main(String args[]){
         new Hamster();
        Rodent obj_array[]=new Rodent[4];
        obj_array[0]=new Rodent();
        obj_array[1]=new Mouse();
        obj_array[2]=new Gerbil();
        obj_array[3]=new Hamster();
        for(int i=0;i<4;i++){
            obj_array[i].show();
        }


    }


}
