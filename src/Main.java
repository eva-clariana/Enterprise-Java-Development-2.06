import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Eva", 10);
        Student student2 = new Student("Toni", 70);
        Student student3 = new Student("Laura", 20);
        Student student4 = new Student("Axel", 50);

        Map<String, Student> students = new HashMap<>();

        students.put(student1.getName(), student1);
        students.put(student2.getName(), student2);
        students.put(student3.getName(), student3);
        students.put(student4.getName(), student4);

        for (Map.Entry<String, Student> entry : students.entrySet()) {

            System.out.println("key=" + entry.getKey() + ", grade=" + entry.getValue().getGrade());
        }
        System.out.println("-------------Increase Grade 10%: ----------------------------------------");

        student1.increaseGrade(students);

        for (Map.Entry<String, Student> entry : students.entrySet()) {

            System.out.println("key= " + entry.getKey() + ", grade= " + entry.getValue().getGrade());
        }



    }
}