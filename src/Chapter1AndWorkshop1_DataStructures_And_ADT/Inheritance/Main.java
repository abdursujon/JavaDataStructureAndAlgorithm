package Chapter1AndWorkshop1_DataStructures_And_ADT.Inheritance;

public class Main {
    public static void main(String [] args){
       Animal one;

       one = new Dog();
       one.sound();

       one = new Cat();
       one.sound();

       one = new Bird();
       one.sound();

    }
}
