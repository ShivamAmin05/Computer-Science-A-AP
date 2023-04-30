public class Puck extends Disk {
    private double weight;
    private boolean standard;
    private boolean youth;
  
    public Puck(double r, double t, double w) {
      super(r, t);
      setWeight(w);
      if (weight >= 4 && weight <= 4.5)
        youth = true;
      if (weight >= 5 && weight <= 5.5)
        standard = true;
    }
  
    public void setWeight(double newWeight) {
      weight = newWeight;
    }
  
    public double getWeight() {
      return weight;
    }
  
    public String getDivision() {
      return "Youth division: " + youth + "\n" + "Standard division: " + standard;
    }
    public String toString() {
      return "The radius is " + super.getRadius() + "and the thickness is " + super.getThickness() + "and the weight is " + weight;  
    }
  }