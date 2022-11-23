package Day28_InheritanceandAbstraction;

import CustomClasses.AnimalClass;

import java.util.ArrayList;

public class Topic2_Polymorphism {
    public static void main(String[] args) {
        Animal MyAnimal = new Animal();
        Animal MyDog = new Dog();
        Animal MyPig = new Pig();

        ArrayList<Animal> MyZoo = new ArrayList<>();
        MyZoo.add(MyAnimal);
        MyZoo.add(MyDog);
        MyZoo.add(MyPig);
    }
}

// Class int extend Object  <--- this is not true!!
// Class Integer extends Object
// Class String extends Object
// Class Animal extends Object


// Object -> Animal
class Animal{
    public void AnimalSound(){
        System.out.println("The animal makes a sound");
    }
}

// Object -> Animal -> Dog
class Dog extends Animal{
    @Override
    public void AnimalSound() {
        System.out.println("The dog says: woof woof");
    }
}

// Object -> Animal -> Pig
class Pig extends Animal{
    @Override
    public void AnimalSound() {
        System.out.println("The pig says: oink oink");
    }
}