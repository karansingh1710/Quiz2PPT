/*
 * Create a superclass called Animal with a method makeSound() that prints the sound made by the animal. Implement subclasses Dog, Cat, and Cow that inherit from the Animal class. Implement the makeSound() method in each subclass to print the sound made by a dog, cat, and cow, respectively.
 */

abstract class Animal{
   abstract void makeSound();
 }

 class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
 }
 class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
 }

 class Cow extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Moo");
    }
 }
public class FirstQues {
public static void main(String[] args) {
    Animal dog=new Dog();
    Animal cat=new Cat();
    Animal cow=new Cow();

    System.out.print("Dog : ");
    dog.makeSound();
    
    System.out.print("Cat : ");
    cat.makeSound();

    
    System.out.print("Cow : ");
    cow.makeSound();
}
}
