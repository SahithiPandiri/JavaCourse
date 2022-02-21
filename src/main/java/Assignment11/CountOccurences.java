package Assignment11;
import java.io.File;
import java.util.*;
import java.util.*;
public class CountOccurences{
    public static void main(String args[]){
        Scanner infile;
        String str="";
        try{
            infile= new Scanner(new File("input.txt"));
            while(infile.hasNext()){
                str=str+infile.next();
            }
        }
        catch(Exception e){
            System.out.println("file not found");
        }
        count(str);

    }
    public static void count(String s){
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch))
                hm.put(ch,hm.get(ch)+1);
            else
                hm.put(ch,1);
        }
        for(Character c:hm.keySet()){
            System.out.println(c + " : "+hm.get(c));
        }

    }

}
