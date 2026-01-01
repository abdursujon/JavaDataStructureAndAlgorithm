package Chapter1AndWorkshop1_DataStructures_And_ADT.Abstraction;

// Extend the abstract class Vehicle
public class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car has started.");
    }

    @Override
    void drive() {
        System.out.println("Car is driving");
    }

    @Override
    void stop() {
        System.out.println("Car stoped");
    }
}
