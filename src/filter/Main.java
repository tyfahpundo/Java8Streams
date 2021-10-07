package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        double sum = 0.0;
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("tyfah",75));
        listStudents.add(new Student("mason",95));
        listStudents.add(new Student("monalisa",65));
        listStudents.add(new Student("John",25));
        listStudents.add(new Student("Marry",55));

        //Find students whose score is >=70
        List<Student> goodStudents = new ArrayList<>();
        goodStudents = listStudents.stream()
                .filter(s-> s.getScore()>=70)
                .collect(Collectors.toList());
        goodStudents.stream().forEach(s -> System.out.println(s));

        //Calculate average score of all students
        double average = listStudents.stream()
                .mapToInt(s-> s.getScore())
                .average().getAsDouble();
        System.out.println("Avearge score: "+average);
        //getting the top student
        List<Student> topStudent = listStudents.stream()
                .filter(s->s.getScore()>=70)
                .sorted()
                .limit(1)
                .collect(Collectors.toList());
        System.out.println("The top student by score: ");
        topStudent.forEach(s-> System.out.println(s));
    }
}
