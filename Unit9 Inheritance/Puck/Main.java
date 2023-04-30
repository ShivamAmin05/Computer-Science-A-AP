public class Main {

    public static void main(String[] args) {
      // create a youth puck object
      Puck youthPuck = new Puck(3, 1, 4);
      // create an adult puck object
      Puck adultPuck = new Puck(3, 1, 5);
  
      System.out.println(youthPuck.getDivision());
      System.out.println("The youth puck has weight " + youthPuck.getWeight() + " ounces.");
      System.out
          .println("The youth puck as radius " + youthPuck.getRadius() + " and thickness " + youthPuck.getThickness());
      System.out.println(adultPuck.getDivision());
      System.out.println("The adult puck has weight " + adultPuck.getWeight() + " ounces.");
      System.out
          .println("The adult puck as radius " + adultPuck.getRadius() + " and thickness " + adultPuck.getThickness());
    }
  }