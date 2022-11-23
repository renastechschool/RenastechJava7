package Day28_InheritanceandAbstraction;

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

        for (int i = 0; i < MyZoo.size(); i++) {
            Animal AnAnimal = MyZoo.get(i);
            AnAnimal.AnimalSound();

//            Below code is same with the code above
//            MyZoo.get(i).AnimalSound();
        }

        /*
        Polymorphism means "many forms"
        In Java, Polymorphism means same object performing different operations according to the requirement.
        (in Java all classes inherit from Object.)
        in other words Polymorphism is simply the ability of an object to specialize its behavior based on its type.
         Polymorphism can be achieved by using two ways, those are

        Method overriding
        Method overloading

         */

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
    public void AnimalSound(String param1){
        System.out.println(param1+" makes a sound");
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