/**
 * Disk class.
 */
public class Disk extends Circle {
    private double thickness;
  
    /**
     * constructor
     * pre: none
     * post: A Disk object has been created with radius r
     * and thickness t.
     */
    public Disk(double r, double t) {
      super(r);
      setThickness(t);
    }
  
    /**
     * Changes the thickness of the disc.
     * pre: none
     * post: Thickness has been changed.
     */
    public void setThickness(double newThickness) {
      thickness = newThickness;
    }
  
    /**
     * Returns the thickness of the disc.
     * pre: none
     * post: The thickness of the disc has been returned.
     */
    public double getThickness() {
      return thickness;
    }
  
    /**
     * Returns the volume of the disc.
     * pre: none
     * post: The volume of the disc has been returned.
     */
    public double volume() {
      return (area() * thickness);
    }
  
    /**
     * Determines if the object is equal to another
     * Disk object.
     * pre: none
     * post: true has been returned if the objects have
     * the same radii and thickness. false has
     * been returned otherwise.
     */
    public boolean equals(Disk obj) {
      if(this.getThickness() == obj.getThickness() && super.equals(obj))
      {
        return true;
      }
      return false;
    }
  
    /**
     * Returns a String that represents the Disk object.
     * pre: none
     * post: A string representing the Disk object has
     * been returned.
     */
    public String toString() {
      return "The radius of the disk is " + super.getRadius() + " and the thickness of the object is " + thickness;
    }
  }