
package activities;

public class Car {
    
    String color;
    String transmission;
    int year;
    int tyres;
    int doors;

    // Constructor
    public Car(String color, String transmission, int year, int tyres, int doors) {
        this.color = color;
        this.transmission = transmission;
        this.year = year;
        this.tyres = tyres;
        this.doors = doors;
    }
    public void displayCharacteristics() {
        System.out.println("Color of the car is: " + this.color);
        System.out.println("Transmission of the car is: " + this.transmission);
        System.out.println("Manufacture Year of the car is: " + this.year);
        System.out.println("Car has this many tyres: " + this.tyres);
        System.out.println("Car has this many doors: " + this.doors);
    }
    public void accelerate() {
        System.out.println("Car is moving forward.");
    }

    public void brake() {
        System.out.println("Car has stopped.");
    }
}
