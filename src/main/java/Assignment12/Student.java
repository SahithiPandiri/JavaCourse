package Assignment12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Student {
    int roll;
    String name;
    int age;
    String gender;
    String branch;
    int year;
    double percent;
     public Student(int roll, String name, int age, String gender, String branch, int year, double percent){
         this.roll=roll;
         this.name= name;
         this.age=age;
         this.gender=gender;
         this.branch=branch;
         this.year=year;
         this.percent=percent;
     }
     public int getAge(){
         return age;
     }
     public double getPercent(){
         return percent;
     }
     public String getBranch(){
         return branch;
     }
     public String getName(){
         return name;
     }
     public String getGender(){
         return gender;
     }
     public static void main(String args[]){
         ArrayList<Student> StudentList=new ArrayList<>();
         StudentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
         StudentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
         StudentList.add( new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
         StudentList.add( new Student(144, "Murali Gowda", 18, "Male","Electrical", 2018, 80));
         StudentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
         StudentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
         StudentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
         StudentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
         StudentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
         StudentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
         StudentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
         StudentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
         StudentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
         StudentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
         StudentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
         StudentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
         StudentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
         Stream s=new Stream();
         s.After2018(StudentList);
         s.Average(StudentList);
         s.AveragePercent(StudentList);
         s.CompDeptStudents(StudentList);
         s.CountInDepartment(StudentList);
         s.MaleCseStundents(StudentList);
         s.Percent(StudentList);
         s.Departments(StudentList);

     }
}
