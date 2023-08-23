
import java.util.ArrayList;
import java.util.List;

class student1 {
    private int studentId;
    private String name;

    public student1(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int studentId) {
        students.removeIf(student -> student.getStudentId() == studentId);
    }

    public Student searchStudent(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getName());
        }
    }

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();

        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");
        Student student3 = new Student(3, "Charlie");

        sms.addStudent(student1);
        sms.addStudent(student2);
        sms.addStudent(student3);

        sms.displayAllStudents();

        sms.removeStudent(2);

        Student foundStudent = sms.searchStudent(1);
        if (foundStudent != null) {
            System.out.println("Found student: " + foundStudent.getName());
        } else {
            System.out.println("Student not found.");
        }
    }
}
