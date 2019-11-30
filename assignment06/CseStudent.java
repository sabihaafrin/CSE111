package assignment06;

public class CseStudent extends Student {

    public CseStudent() {
        super();
        super.setName("CSE student name");
        super.setDepartment("CSE");

    }
public CseStudent(String name, String id) {
        super(name, id);
    }
    public CseStudent(String name, String id, String dept) {
        super(name, id, "CSE");
    }

    public CseStudent(String name, String id, double cgpa, int credit) {
        super(name, id, "CSE", cgpa, credit);
    }

    
}
