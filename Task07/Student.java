package Task07;
public class Student {

    public static int numberOfStudents=0;
   String name1;
    
   public Student()
           {
            name1="default name";
            numberOfStudents++;
           }
   public Student(String Name1){
   this.name1= Name1;
   numberOfStudents++;
   }
   public String getName()
   {
       return name1;
   }
   public void numberofStudents()
   {
      
   }
}
 
