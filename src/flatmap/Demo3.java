package flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    int id;
    String name;
    char grade;
    public Student(int id, String name,char grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student(101,"Tafadzwa",'A'));
        studentList1.add(new Student(102,"Monalisa",'B'));
        studentList1.add(new Student(103,"Alex",'C'));

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student(201,"Shelton",'C'));
        studentList2.add(new Student(202,"Rodney",'B'));
        studentList2.add(new Student(203,"Keith",'A'));

        List<List<Student>> studentList = Arrays.asList(studentList1,studentList2);

        List<String> nameList = studentList.stream()
                .flatMap(studList -> studList.stream())
                .map(s -> s.name)
                .collect(Collectors.toList());

        System.out.println(nameList);
    }
}
