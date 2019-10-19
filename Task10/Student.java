package Task10;
class Student
{
  public String name;
  public int id;
  
  Student()
  {
  }
  Student(String n, int i)
  {
    this.name=n;
    this.id=i;
    
  }
  public void printDetail(Student s){
System.out.println("Name of the Student: "+s.name);
System.out.println("ID of the Student: "+s.id);
}
}


 
 
 
