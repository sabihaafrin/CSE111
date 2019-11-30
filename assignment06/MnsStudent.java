package assignment06;

public class MnsStudent extends Student {

   public MnsStudent() {
        super();
        super.setName(" MNS student name");
        super.setDepartment("MNS");

    }
 public MnsStudent(String name, String id) {
        super(name, id);
    }

    public MnsStudent(String name, String id, String dept) {
        super(name, id, "MNS");
    }

    public MnsStudent(String name, String id, double cgpa, int credit) {
        super(name, id, "MNS", cgpa, credit);
    }
}