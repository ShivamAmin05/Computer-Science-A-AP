/**
 * Car class.
 */
public class Car extends Vehicle {
    /**
     * constructor
     * pre: none
     * post: A car has been created.
     */
    public Car(int fECity, int fEHwy, int seating, double trunkSpace) {
      super(fECity, fEHwy, seating, trunkSpace);
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
     * Returns a description of the car
     * pre: none
     * post: A description of the car has been returned.
     */
    public String description() {
      String car;
      car = "This car can seat " + super.getSeating() + " passengers.\n";
      car += "The car has a cargo volume of " + super.getCargoVolume() + ".\n";
      car += "The fuel economy is " + super.getFECity() + " city and " +
          super.getFEHwy() + " highway miles.\n";
      return (car);
    }
  }
  