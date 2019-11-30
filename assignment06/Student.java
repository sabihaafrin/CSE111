package assignment06;

import java.util.ArrayList;

public class Student {

    public String name= " ";
    public String id;
    public String department;
    public double cgpa;
    public int credit;
    public double creditsDone = 0.0;
    public double cgpaCounted = 0.0;
    public static int numberOfStudents=0;
    public ArrayList<String> currentCourses;
    public ArrayList<String> completedCourses;

    public Student() {
        this.name = "default student";
        this.id = "000000" +(numberOfStudents++);
        this.department = "Not Given";
        this.cgpa = 0.0;
        this.credit = 0;
        this.currentCourses = new ArrayList<>();
        this.completedCourses = new ArrayList<>();
    }

    public Student(String name, String ID, String dept) {
        this.name = name;
        this.id = ID;
        this.department = dept;
        this.cgpa = 0.0;
        this.credit = 0;
        this.currentCourses = new ArrayList<>();
        this.completedCourses = new ArrayList<>();
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.cgpa = 0.0;
        this.credit = 0;
        this.currentCourses = new ArrayList<>();
        this.completedCourses = new ArrayList<>();
    }

    public Student(String name, String id, String dept, double cgpa, int credit) {
        this.name = name;
        this.id = id;
        this.department = dept;
        this.cgpa = cgpa;
        this.credit = credit;
        this.currentCourses = new ArrayList<>();
        this.completedCourses = new ArrayList<>();
    }

public void GivenCourses(String nameOfCourse) {
        if (getCurrentCourses().contains(nameOfCourse)) {
            getCurrentCourses().add(nameOfCourse);
        } else {
            System.out.println(this.getId() + "Course taken");
        }
    }

    public void CoursesDone(String nameOfCourse) {
        if (getCurrentCourses().contains(nameOfCourse)) {
            getCompletedCourses().add(nameOfCourse);
            getCurrentCourses().remove(nameOfCourse);
        } else {
            System.out.println(this.getId() + "Course is not taken");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartment() {
        return department;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCredit() {
        return (int) credit;
    }

    public ArrayList<String> getCurrentCourses() {
        return currentCourses;
    }

    public ArrayList<String> getCompletedCourses() {
        return completedCourses;
    }

    @Override
        public String toString() {
        String value = "Name : " + this.getName() + "\n" + "ID : " + this.getId() + "\n"
                + "Department : " + this.getDepartment() + "\n" + "Credit : " + this.getCredit() + "\n"
                + "CGPA : " + this.getCgpa() + "\n" + "Recent Course : " + "\n";
        if (this.currentCourses.isEmpty()) {
            value = value.concat("No Courses" + "\n");
        } else {
            for (String course : this.currentCourses) {
                value = value.concat(course + "\n");
            }
        }
        value = value.concat("Courses Done : " + "\n");
        if (this.completedCourses.isEmpty()) {
            value = value.concat("No Courses" + "\n");
        } else {
            for (String course : this.completedCourses) {
                value = value.concat(course + "\n");
            }
}

        return value;
}
}
