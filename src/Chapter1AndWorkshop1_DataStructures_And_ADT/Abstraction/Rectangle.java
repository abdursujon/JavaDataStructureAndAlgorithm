package Chapter1AndWorkshop1_DataStructures_And_ADT.Abstraction;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}
