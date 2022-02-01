package com.example.javapractice;
import java.util.*;
public class NameParser {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        int space=name.indexOf(" ");
        System.out.println(space);
        String firstName=name.substring(0,space);
        String lastName=name.substring(space+1);
        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toUpperCase());

    }
}
