
import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
}

public class StudentDataHandler {

    // Write student data to a file
    public static void writeToFile(List<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student_data.txt"))) {
            for (Student student : students) {
                writer.write(student.getId() + "," + student.getName());
                writer.newLine();
            }
            System.out.println("Student data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read student data from a file
    public static List<Student> readFromFile() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("student_data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                students.add(new Student(id, name));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John Doe"));
        students.add(new Student(2, "Jane Smith"));

        // Write student data to file
        writeToFile(students);

        // Read student data from file
        List<Student> readStudents = readFromFile();

        // Display read student data
        for (Student student : readStudents) {
            System.out.println("Read student: ID=" + student.getId() + ", Name=" + student.getName());
        }
    }
}
