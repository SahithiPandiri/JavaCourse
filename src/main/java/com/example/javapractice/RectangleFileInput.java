package com.example.javapractice;
import java.util.*;
import java.io.*;
public class RectangleFileInput {
    public static void main(String args[]){
        ArrayList<RectangleFun> arr= new ArrayList<>();
        Scanner infile;
        try{
            infile=new Scanner(new File("Rectangledata.txt"));
            int length=infile.nextInt();
            int width=infile.nextInt();
            RectangleFun temp=new RectangleFun(length,width);
            arr.add(temp);
        }
        catch(FileNotFoundException e){

        }
        for(RectangleFun r:arr){
            System.out.println(r.getLength());
            System.out.println(r.getArea());
        }
    }
}
