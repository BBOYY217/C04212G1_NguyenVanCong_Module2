package Bai_05_advanced_programming_with_java.exercise;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getClasses());
        student.setName("Cong");
        student.setClasses("C04");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
