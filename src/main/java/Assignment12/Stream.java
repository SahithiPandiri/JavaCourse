package Assignment12;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Stream {
    public void Departments(List<Student> StudentList) {
        StudentList.stream().map(Student -> Student.branch).distinct().forEach(System.out::println);
    }
    public void After2018(List <Student> StudentList){
        StudentList.stream().filter(Student->Student.year>2018).map(s->s.getName()).collect(Collectors.toList()).forEach(System.out :: println);
    }
    public void  MaleCseStundents(List <Student> StudentList) {
        StudentList.stream()
                .filter(Student -> Student.gender.equals("Male") && (Student.branch.equals("Computer Science")))
                .forEach(s -> System.out.println(s.name));
    }
    public void Count(List <Student> StudentList){
        StudentList.stream().collect(groupingBy(Student :: getGender)).forEach((k,v)->System.out.println(k+ " : "+v.size()));
    }
    public void Average(List <Student> StudentList) {
        StudentList.stream()
                .collect(groupingBy(Student::getGender, averagingInt(Student::getAge)))
                .forEach((k, v) -> System.out.println(k + "average age is " + v));
    }
    public void Percent(List <Student> StudentList) {
        Student studentPercentage = StudentList.stream().max(Comparator.comparing(Student::getPercent)).orElseThrow(NoSuchElementException::new);
        System.out.println(studentPercentage.percent);
    }
    public void CountInDepartment(List <Student> StudentList) {
        StudentList.stream()
                .collect(groupingBy(Student::getBranch)).forEach((k, v) -> System.out.println(k + "Department has " + v.size() + " Students."));
     }
       public void AveragePercent(List <Student> StudentList) {
           StudentList.stream()
                   .collect(groupingBy(Student::getBranch, averagingDouble(Student::getPercent))).
                   forEach((k, v) -> System.out.println(k + " Department has average percentage " + v));
       }
       public void CompDeptStudents(List <Student> StudentList) {
           StudentList.stream()
                   .filter(st -> st.branch.equals("Computer Science"))
                   .collect(groupingBy(Student::getGender)).forEach((k, v) -> System.out.println(k + " " + v.size()));
       }
}
