package Assignment9;
import java.util.*;
import java.util.regex.*;

public class PatternMatching {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String qstn = sc.nextLine();
        Pattern p = Pattern.compile("^[A-Z][a-zA-Z]*");
        Matcher m = p.matcher("qstn");
        boolean b = m.matches();
        System.out.println(b);
    }

}

