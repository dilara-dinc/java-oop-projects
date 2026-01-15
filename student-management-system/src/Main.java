import model.Student;
import service.StudentService;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();

        studentService.addStudent(new Student(1, "Dilara", 3.45));
        studentService.addStudent(new Student(2, "Ali", 2.98));

        for (Student student : studentService.getAllStudents()) {
            System.out.println(student);
        }
    }
}
