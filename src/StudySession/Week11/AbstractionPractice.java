package StudySession.Week11;

public class AbstractionPractice {

    public static void main(String[] args) {

        // We cannot create object with abstract class
       // Animal animal = new Animal();

        Dog dog = new Dog();

        dog.animalSound1();
        dog.animalSound2();

        Animal dog2 = new Dog();


    }


}


abstract class Animal
{
    abstract void animalSound1();
    abstract void animalSound2();

    public void sleep()
    {
        System.out.println("zzzz");
    }

}


class Dog extends Animal
{

    @Override
    void animalSound1() {
        System.out.println("hav");
    }

    @Override
    void animalSound2() {
        System.out.println("havhav");
    }
}