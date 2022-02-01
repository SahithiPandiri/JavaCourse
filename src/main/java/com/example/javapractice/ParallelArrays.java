package com.example.javapractice;
import java.util.*;
public class ParallelArrays {
    public static void main(String args[]){
        String names[]=new String[5];
        int age[]=new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++){
            names[i]=sc.next();
            age[i]=sc.nextInt();

        }
        for(int i=0;i<5;i++){
            System.out.println(names[i] + " is "+ age[i]+" years old" );
        }
    }
}
