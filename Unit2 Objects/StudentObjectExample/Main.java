/*
    Example of using Objects with a Dog class
*/
class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the Dog program: ");

    //object 1
    Dog d1 = new Dog();
    System.out.println(d1); //automatically calls toString method
    //object 2
    Dog d2 = new Dog("Mastiff", "Large", 5, "black");
    d1.changeBreed("Bulldog");
    System.out.println(d1);
    
  }
}