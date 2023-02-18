import java.util.Map;

public class Student {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Map<String, Student> increaseGrade(Map<String, Student> students){

        for (Map.Entry<String, Student> entry : students.entrySet()) {

            int grade = entry.getValue().getGrade();
            entry.getValue().setGrade((int) (grade*1.1));

        }

        return students;

    }
}
