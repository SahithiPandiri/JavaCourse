package com.example.javapractice;
import java.util.*;
public class RandomFun {
    public static void main(String args[]){
      Random random= new Random();
      int myRandomNumber;
      myRandomNumber=random.nextInt(900)+1;
      System.out.println(myRandomNumber);
    }
}
