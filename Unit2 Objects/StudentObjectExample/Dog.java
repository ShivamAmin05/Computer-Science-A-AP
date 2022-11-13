/*
   Class Dog will not have a main method
   This class is considered our constructor class
*/
public class Dog {
  //instance variables
  private String breed;
  private String size;
  private int age;
  private String color;  

  //Default Constructor
  public Dog(){
      breed = "Lab";
      size = "small";
      age = 1;
      color = "black";
  }

  //Overloaded Constructor
  public Dog (String breed, String size, int age, String color)
  {
    this.breed = breed;
    this.size = size;
    this.age = age;
    this.color = color;
  }

  //other methods / actions 
  public void changeBreed(String br)
  {
    breed = br;
  }

  //used to display attributes of the object
  public String toString()
  {
    return "Breed: " + breed + " | Size: " + size + " | Age: " + age + " | Color: " + color;
  }
  
}