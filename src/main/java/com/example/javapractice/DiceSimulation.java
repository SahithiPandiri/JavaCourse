package com.example.javapractice;
import java.util.*;
public class DiceSimulation {
    public  static void main(String args[]){
        Random r= new Random();
        int count=0;
        while(count<=10){
            System.out.println(r.nextInt(6)+1);
            count++;
        }
    }
}
