package com.example.javapractice;
public class ArrayFun {
    public  static void main(String args[]){
        int arr[]=new int[10];
        for(int i=1;i<=10;i++)
            arr[i-1]=i;
        for(int i=0;i<10;i++)
            System.out.println(arr[i]);
    }
}
