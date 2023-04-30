/**
 * Minivan class.
 */
public class Minivan extends Vehicle {
    /**
     * constructor
     * pre: none
     * post: A minivan has been created.
     */
    public Minivan(int fECity, int fEHwy, int seating, double cargo) {
      super(fECity, fEHwy, seating, cargo);
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
      cargoArea = "The cargo hold is " + getCargoVolume();
      return (cargoArea);
    }
  
    /**
     * Returns a description of the truck
     * pre: none
     * post: A description of the truck has been returned.
     */
    public String description() {
      String van;
      van = "This minivan can seat " + super.getSeating() + " passengers.\n";
      van += "The cargo space volume is " + super.getCargoVolume() + ".\n";
      van += "The fuel economy is " + super.getFECity() + " city and " +
          super.getFEHwy() + " highway miles.\n";
      return (van);
    }
  }
  