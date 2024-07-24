import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Course> courses;

    public University(String name) {
        this.name = name;
        this.courses = new ArrayList<>(); // Inicializar a lista de cursos
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public String printCourses(){
        StringBuilder sb = new StringBuilder();
        sb.append("University: ").append(name).append("\nCourses:\n");
        for (Course c : courses) {
            sb.append(c.printStudents()).append("\n"); // Chama printStudents para cada curso
        }
        return sb.toString();
    }
}