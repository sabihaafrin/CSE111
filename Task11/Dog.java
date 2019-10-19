package Task11;
public class Dog 
{ 
  private String color = "Black"; 
  
  Dog() 
  {
  }
  
  Dog (String color){
    this.color = color;
  }
  
  public void bark() {
    String b= color+" dog is barking";
    System.out.println(b);
  }
  public void changeColor(String cc)
  {
   this.color=cc; 
   
  }
}