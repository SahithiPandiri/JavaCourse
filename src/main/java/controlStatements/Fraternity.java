package controlStatements;
import java.util.*;
public class Fraternity
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        char gender=sc.next().charAt(0);
        int age=sc.nextInt();
        if((gender=='M'|| gender=='m') && age>=19){
            System.out.println("You have fraternity rights");
        }
        else
            System.out.println("You don't have fraternity rights");

    }
}
