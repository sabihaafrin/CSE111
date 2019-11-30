package assignment06;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTester {

    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        BbaStudent b1 = new BbaStudent("Shushmita Deb", " 19154545 ");
        BbaStudent b2 = new BbaStudent();
        CseStudent c1 = new CseStudent("Sabiha Afrin", " 19101050 ");
        CseStudent c2 = new CseStudent();
        MnsStudent m1 = new MnsStudent("Samiha nourin", " 19168784 ");
        MnsStudent m2 = new MnsStudent();
        addStudent(b1);
        addStudent(b1);
        addStudent(b2);
        addStudent(c1);
        addStudent(c2);
        addStudent(m1);
        addStudent(m2);
        b1.GivenCourses("ENG102");
        b1.GivenCourses("BUS201");
        b1.GivenCourses("CSE101");
        b1.CoursesDone("BUS201");
        b1.CoursesDone("CSE101");
        c1.GivenCourses("CSE110");
        c1.GivenCourses("CSE111");
        c1.GivenCourses("CSE220");
        c1.CoursesDone("CSE110");
        m1.GivenCourses("BT0101");
        m1.CoursesDone("BTO101");
        removeStudent(c2);
        System.out.println();
        students.forEach((student) -> {
            System.out.println(student);});
    }

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static void removeStudent(Student student) {
        students.remove(student);
    }

}
