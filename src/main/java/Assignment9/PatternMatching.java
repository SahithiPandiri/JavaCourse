package Assignment9;
import java.util.*;
import java.util.regex.*;

public class PatternMatching {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
         System.out.println(Pattern.matches("[A-Z][a-z]*\\.",str));
    }

}

