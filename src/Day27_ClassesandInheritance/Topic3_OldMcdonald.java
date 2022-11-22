package Day27_ClassesandInheritance;

import CustomClasses.ChickenClass;
import CustomClasses.CowClass;

public class Topic3_OldMcdonald {
    public static void main(String[] args) {
        CowClass MyCow = new CowClass();
        MyCow.AnimalName = "aCow";
        MyCow.ID = 1234;
        MyCow.NumberOfLegs = 4;

        ChickenClass MyChicken = new ChickenClass();
        MyChicken.AnimalName = "Tweety";

        MyCow.Eat();
        MyCow.Milk();
    }
}
