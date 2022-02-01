package com.example.javapractice;
import java.util.*;
public class EvenOnly {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        for(int num=0;num<=10;num++){
            if(num%2!=0)
                continue;
            System.out.println(num);
        }
    }
}
