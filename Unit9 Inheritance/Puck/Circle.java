public class Circle {
    private static double PI = 3.14;
    private double radius;
  
    /**
     * constructor
     * pre: none
     * post: A Circle object created. Radius initialized to 1.
     */
    public Circle() {
      // default radius
      setRadius(1);
      ;
    }
  
    /**
     * constructor
     * pre: none
     * post: A Circle object created with radius r.
     */
    public Circle(double r) {
      setRadius(r);
    }
  
    /**
     * Changes the radius of the circle.
     * pre: none
     * post: Radius has been changed.
     */
    public void setRadius(double newRadius) {
      radius = newRadius;
    }
  
    /**
     * Calcuates the area of the circle.
     * pre: none
     * post: The area of the circle has been returned.
     */
    public double area() {
      return (Math.PI * (Math.pow(radius, 2)));
    }
  
    /**
     * Returns the radius of the circle.
     * pre: none
     * post: The radius of the circle has been returned.
     */
    public double getRadius() {
      return radius;
    }
  
    /**
     * Displays the formula for the area of a circle.
     * pre: none
     * post: formula for area of a circle displayed.
     */
    public static void displayAreaFormula() {
      System.out.println("" + Math.PI + "*" + "(radius)^2");
    }
  
    /**
     * Determines if the object is equal to another
     * Circle object.
     * pre: none
     * post: true has been returned if the objects have
     * the same radii. false has been returned otherwise.
     */
    public boolean equals(Circle obj) {
      if (this.getRadius() == obj.getRadius()) {
        return true;
      }
      return false;
    }
  
    /**
     * Returns a String that represents the Circle object.
     * pre: none
     * post: A string representing the Circle object has
     * been returned.
     */
    public String toString() {
      return "The radius of the circle is " + radius;
    }
  }