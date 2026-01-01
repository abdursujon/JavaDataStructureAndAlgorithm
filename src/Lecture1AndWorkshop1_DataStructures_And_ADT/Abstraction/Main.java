package Lecture1AndWorkshop1_DataStructures_And_ADT.Abstraction;

public class Main {
    public static void main (String [] args){
        Car car = new Car();
        car.start();
        car.drive();
        car.stop();

        // Test abstraction class which use the interface
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(5,7);

        System.out.println("Area of circle is: " + circle.calculateArea());
        System.out.println("Area of rectangle is: " + rectangle.calculateArea());
    }
}
