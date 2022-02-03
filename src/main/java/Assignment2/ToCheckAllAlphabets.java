package Assignment2;
import java.util.*;
public class ToCheckAllAlphabets {
    static boolean check(String input){
<<<<<<< HEAD
        input=input.toLowerCase();
=======
>>>>>>> origin/master
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<input.length();i++){
            if(Character.isAlphabetic(input.charAt(i)))
                hs.add(input.charAt(i));
        }
        if(hs.size()==26)
            return true;
        else
            return false;

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String input=sc.next();
        if(checkAllAlphabets(input)){
            System.out.println("All Alphabets are present");
        }
        else{
            System.out.println("All Alphabets are not present");
        }

        if(check(input)){
            System.out.println("All Alphabets are present");
        }
        else{
            System.out.println("All Alphabets are not present");
        }

    }
    static boolean checkAllAlphabets(String input){
<<<<<<< HEAD
        input=input.toLowerCase();
=======
>>>>>>> origin/master
        if(input.length()<26){
            return false;
        }
        int count=0;
        char alphabets[]=input.toCharArray();
        Arrays.sort(alphabets);
        char ch='a';
        for(int i=0;i<alphabets.length;i++){
            if(alphabets[i]==ch){
                count++;
                ch++;
            }
            else if(alphabets[i] > ch){
                return false;
            }
        }
        if(count==26)
            return true;
        else
            return false;

    }

}
