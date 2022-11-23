package Day28_InheritanceandAbstraction;

public class Topic3_Abstraction {
    public static void main(String[] args) {
        Cat MyCat = new Cat();
        MyCat.Walk();

        Dolphin MyDolphin = new Dolphin();
        MyDolphin.Swim();

        Lion MyLion = new Lion();
        MyLion.Walk();

        System.out.println("--------------------------");
        TerrestrialAnimals AnAnimal;
        AnAnimal = new Lion();
        AnAnimal.Walk();
    }
}
//The animals which live in water. Examples : Octopus, Fish, Shark
interface AquaticAnimals{
    void Swim(); //This is an ABSTRACT method
}

// The animals which live in land. Examples : Cow, Lion, Deer
interface TerrestrialAnimals{
    void Walk(); //This is an ABSTRACT method
}

class Cat implements TerrestrialAnimals{
    @Override
    public void Walk() {
        System.out.println("Cat is walking.");
    }
}
//What is different between extends and implements keyword.
class Lion extends Cat{
    @Override
    public void Walk() {
        System.out.println("Lion is walking");
    }
}

class Dolphin implements AquaticAnimals{
    @Override
    public void Swim() {
        System.out.println("Dolphin is swimming.");
    }
}
// Can you implement a class from more than one interface?
class Penguin implements AquaticAnimals, TerrestrialAnimals{
    @Override
    public void Swim() {
        System.out.println("Penguin is swimming!");
    }

    @Override
    public void Walk() {
        System.out.println("Penguin is walking!");
    }
}


// Can you extend a class from more than one class?
//NO, Class cannot extend multiple classes
/* I cannot write below code
class Tiger extends Cat,Lion{

}
 */