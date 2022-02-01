package com.example.javapractice;
import java.util.*;
public class LearningPackage {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int learningPackage=sc.nextInt();
        int totalCost=0;
        int totalCourses=sc.nextInt();
        if(learningPackage==1) {
            totalCost = 10;
            if (totalCourses > 2) {
                totalCost = totalCost + ((totalCourses - 2) * 6);
            }
        }
        if(learningPackage==2) {
            totalCost = 12;
            if (totalCourses > 4) {
                totalCost = totalCost + ((totalCourses - 4) * 4);
            }
        }
        if(learningPackage==3) {
            totalCost = 15;
            if (totalCourses > 6) {
                totalCost = totalCost + ((totalCourses - 6) * 3);
            }
        }


        System.out.println(totalCost) ;

    }
}
