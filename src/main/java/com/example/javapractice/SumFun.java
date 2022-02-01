package com.example.javapractice;
import java.util.*;
public class SumFun {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Positive numbers to keep adding");
        System.out.println("Enter Negative Number to stop adding and to et the result");
        int input = sc.nextInt(), sum = 0;
        while (input >= 0) {
            sum+= input;
            input = sc.nextInt();
        }
        System.out.println(sum);

    }
}
