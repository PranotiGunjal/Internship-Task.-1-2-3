
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class StudentManagementSystem {

    private static List<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student Information");
            System.out.println("3. Search for Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    displayStudents();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        System.out.println("Exiting the application.");
    }

    private static void addStudent() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        students.add(new Student(id, name));
        System.out.println("Student added successfully.");
    }

    private static void editStudent() {
        System.out.print("Enter student ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Student student = findStudentById(id);
        if (student != null) {
            System.out.print("Enter new student name: ");
            String newName = scanner.nextLine();
            student.setName(newName);
            System.out.println("Student information updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void searchStudent() {
        System.out.print("Enter student ID to search: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Student student = findStudentById(id);
        if (student != null) {
            System.out.println("Student found: ID=" + student.getId() + ", Name=" + student.getName());
        } else {
            System.out.println("Student not found.");
        }
    }

    private static Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    private static void displayStudents() {
        System.out.println("All Students:");
        for (Student student : students) {
            System.out.println("ID=" + student.getId() + ", Name=" + student.getName());
        }
    }
}
