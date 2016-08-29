/*
* Interface Demo - a demonstration the use of an interface in Java
* From Herbert Schildt's Java: A Beginner's Guide, 6th ed.
* Page 239-240 &amp; Question 9 Chapter 9 Self Test, p. 298.
*/

// A Vehicle interface
public interface IVehicle{

  // calculate the range of the vehicle
  int range();
  // calculate fuel needed
  double fuelNeeded(int miles);

} // end IVehicle

// Vehicle Superclass
class Vehicle implments IVehicle{
  private int passengers; // number of passengers
  private int fuelCap; // fuel capacity in gallons
  private int mpg; // fuel consumption in miles per gallon

  // Constructor
  Vehicle (int p, int f, int m){
    passengers = p;
    fuelCap = f;
    mpg = m;
  }// end Constructor

  // Return the fuel range
  int range(){
    return mpg * fuelCap;
  }

  // Compute fuel needed for a given distance
  double fuelNeeded(int miles){
    return (double) miles / mpg;
  }

  // Accessor methods for instance variables
  int getPassengers(){
    return passengers;
  }

  void setPassengers(int p){
    passengers = p;
  }

  int getFuelCap(){
    return fuelCap;
  }

  void setFuelCap(int f){
    fuelCap = f;
  }

  int getMpg(){
    return mpg;
  }

  void setMpg(int m){
    mpg = m;
  }

}// end Vehicle

class Truck extends Vehicle {
  private int cargoCap; // cargo capacity in pounds

  // Constructor
  Truck(int p, int f, int m, int c){
    super(p, f, m);
    cargoCap = c;
  }

  // Accessor methods for cargoCap
  int getCargoCap(){
    return cargoCap;
  }

  void setCargoCap(int c){
    cargoCap = c;
  }

}// end Truck

class TruckDemo{
  public static void main(String args[]){
    Truck semi = new Truck(2, 200, 7, 44000);
    Truck pickup = new Truck(3, 28, 15, 2000);

    double gallons;
    int dist = 252;

    gallons = semi.fuelNeeded(dist);

    System.out.println("\nA semi-truck can carry " + semi.getCargoCap() + " pounds.");
    System.out.println("To go " + dist + " miles, a semi-truck needs " + gallons + " gallons of fuel.\n");

    gallons = pickup.fuelNeeded(dist);

    System.out.println("A pickup truck can carry " + pickup.getCargoCap() + " pounds.");
    System.out.println("To go " + dist + " miles, a pickup truck needs " + gallons + " gallons of fuel.\n");
  }// end main
}// end TruckDemo
