package Lecture1AndWorkshop1_DataStructures_And_ADT.Polymorphism;

public class Human extends Animal implements Carnivore, Vegetarian{

    @Override
    public Boolean isCarnivore() {
        return true;
    }

    @Override
    public Boolean isVegetarian() {
        return true;
    }

    public void eat() {
        System.out.println("Most human eats meat and vegetables.");
    }

    public static void main (String [] args){
        Human human = new Human();
        Animal animal = human;
        Carnivore carnivore = human;
        Vegetarian vegetarian = human;

        System.out.println("Human is carnivore? : " + carnivore.isCarnivore() + "\nHuman is vegetarian? : " + vegetarian.isVegetarian());
        animal.eat();
    }

}
