package Chapter1AndWorkshop1_DataStructures_And_ADT.Polymorphism;

public class Deer extends Animal implements Vegetarian{


    public Boolean isVegetarian() {
        return true;
    }

    public void eat() {
        System.out.println("Deep eats grass");
    }

    public static void main (String [] args){
        Deer deer = new Deer();
        Animal animal = deer;
        Vegetarian vegetarian = deer;

        animal.eat();
        System.out.println(vegetarian.isVegetarian());
    }
}
