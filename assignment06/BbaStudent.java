package assignment06;

public class BbaStudent extends Student {
    public BbaStudent() {
        super();
        super.setName(" BBA student name");
        super.setDepartment("BBA");

    }
public BbaStudent(String name, String id) {
        super(name, id);
    }
    public BbaStudent(String name, String id, String dept) {
        super(name, id, "BBA");
    }

    public BbaStudent(String name, String id, double cgpa, int credit) {
        super(name, id, "BBA", cgpa, credit);
    }
}