package Assignment7;
class Cycle{
    void balance(){
        System.out.println("In Unicycle");
    }

}
class Unicycle extends Cycle{
    void balance(){
        System.out.println("In Unicycle");
    }

}
class Bicycle extends Cycle{
    void balance(){
        System.out.println("In Bicycle");
    }

}
class Tricycle extends Cycle{

}
public class CycleExercise {
    public static void main(String args[]){
        Cycle ary[]= new Cycle[3];
        ary[0]=new Unicycle();
        ary[1]=new Bicycle();
        ary[2]=new Tricycle();
        ary[0].balance();
        ary[1].balance();
        ary[2].balance();


    }
}

