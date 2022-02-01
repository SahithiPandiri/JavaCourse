package com.example.javapractice;

import java.io.*;
import java.util.ArrayList;

public class FileOutputFun {
    public static void main(String args[]){
        ArrayList<String> list= new ArrayList<>();
        list.add("anurag");
        list.add("sahithi");
        try{
             PrintWriter pw= new PrintWriter("output.txt");
             for(int i=0;i<2;i++) {
                 pw.println(list.get(i));
             }
             pw.close();
        }
        catch(FileNotFoundException ex){

        }
    }
}
