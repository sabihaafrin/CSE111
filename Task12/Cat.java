/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task12;

/**
 *
 * @author user
 */
public class Cat{ 
  public String color = "White"; 
  public String action = "sitting"; 
  
  Cat() 
  {
  }
  
  Cat (String b1)
  {
    color= b1;
  }
  
  Cat(String cl, String activity)
  {
    color=activity;
    action=cl;
  }
  
  public void printCat() 
  {
    System.out.println(color+" cat is "+action);
  }
  public void changeColor(String rong)
  {
  color=rong;
  }
}
 
