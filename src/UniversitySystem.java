import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class UniversitySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Name university: ");
        String nameUniversity = sc.next();
        System.out.println("How many courses do you want? ");
        int quantityCourses = sc.nextInt();

        List<Course> courses = new ArrayList<>();

        for (int i = 0; i < quantityCourses; i++) {
            System.out.println("Name course: ");
            String nameCourse = sc.next();
            System.out.println("How many students in this course? ");
            int quantityStudents = sc.nextInt();

            // Criar nova lista de estudantes para cada curso
            List<Student> students = new ArrayList<>();

            for (int n = 0; n < quantityStudents; n++) {
                System.out.println("Name student #" + (n + 1) + ": ");
                String nameStudent = sc.next();
                System.out.println("ID student #" + (n + 1) + ": ");
                String idStudent = sc.next();

                Student student = new Student(nameStudent, idStudent);
                students.add(student);
            }

            Course course = new Course(nameCourse, students);
            courses.add(course);
        }

        // Criar a universidade e adicionar cursos a ela
        University university = new University(nameUniversity);
        for (Course course : courses) {
            university.addCourse(course);
        }

        // Imprimir detalhes da universidade
        System.out.println(university.printCourses());
    }
}