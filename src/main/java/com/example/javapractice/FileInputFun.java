package com.example.javapractice;
import java.util.*;
import java.io.*;
public class FileInputFun {
public static void main(String args[]){
    Scanner infile;
    try{
        infile= new Scanner(new File("input.txt"));
         while(infile.hasNext()){
             System.out.println(infile.nextInt());
         }
    }
    catch(FileNotFoundException e){
        System.out.println("There is no file such");
    }
}
}
