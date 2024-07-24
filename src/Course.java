import java.util.ArrayList;
import java.util.List;

public class Course {
    private String nameCourse;
    private List<Student> students;

    public Course(String nameCourse, List<Student> students) {
        this.nameCourse = nameCourse;
        this.students = students;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public String printStudents() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course: ").append(nameCourse).append("\nStudents:\n");
        for (Student student : students) {
            sb.append(student).append("\n");
        }
        return sb.toString();
    }
}
