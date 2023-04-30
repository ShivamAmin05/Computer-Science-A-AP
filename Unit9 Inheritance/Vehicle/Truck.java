/**
 * Truck class.
 */
public class Truck extends Vehicle {
    /**
     * constructor
     * pre: none
     * post: A truck has been created.
     */
    public Truck(int fECity, int fEHwy, int seating, double cargoHold) {
      super(fECity, fEHwy, seating, cargoHold);
    }
  
    /**
     * Return the appropriate name of the cargo area
     * and the capacity.
     * pre: none
     * post: The name of the cargo container and its capacity
     * has been returned
     */
    public String cargoContainer() {
      String cargoArea;
      cargoArea = "The cargo hold space is " + getCargoVolume();
      return (cargoArea);
    }
  
    /**
     * Returns a description of the truck
     * pre: none
     * post: A description of the truck has been returned.
     */
    public String description() {
      String truck;
      truck = "This truck can seat " + super.getSeating() + " passengers.\n";
      truck += "The cargo hold has a volume of " + super.getCargoVolume() +
          ".\n";
      truck += "The fuel economy is " + super.getFECity() + " city and " +
          super.getFEHwy() + " highway miles.\n";
      return (truck);
    }
  }
  