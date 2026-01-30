import model.Student;
import service.StudentService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\n--- Student Management System ---");
                System.out.println("1. Add student");
                System.out.println("2. List students");
                System.out.println("3. Find student by ID");
                System.out.println("4. Remove student");
                System.out.println("0. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Department: ");
                        String department = scanner.nextLine();

                        service.addStudent(new Student(id, name, age, department));
                        System.out.println("Student added.");
                        break;

                    case 2:
                        service.listStudents();
                        break;

                    case 3:
                        System.out.print("Enter ID: ");
                        int searchId = scanner.nextInt();
                        Student found = service.findStudentById(searchId);

                        if (found != null) {
                            System.out.println(found);
                        } else {
                            System.out.println("Student not found.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter ID: ");
                        int removeId = scanner.nextInt();
                        service.removeStudentById(removeId);
                        break;

                    case 0:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid option.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }
}
