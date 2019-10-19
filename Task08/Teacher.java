package Task08;
public class Teacher {
    private String name=" ";
    private String dept=" ";
    private String course=" ";

    public Teacher(String name, String dept)
    {
        this.name=name;
        this.dept=dept;
    }
        public void addCourse(Course c)
   
        {
            this.course=this.course+"\n"+c.courseName;
        }
    public void printDetail()
    {
       System.out.println("========================"+"\nName: "+this.name+"\nDepartment: "+this.dept+"\nList of courses"+"\n====================="+this.course);
        System.out.println("========================");
}
}


