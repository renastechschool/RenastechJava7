package Day27_ClassesandInheritance;

import CustomClasses.ChickenClass;
import CustomClasses.CowClass;
import CustomClasses.OldMcDonaldAnimal;

import java.util.ArrayList;

public class Topic3_OldMcdonald {
    public static void main(String[] args) {
        CowClass MyCow = new CowClass();
        MyCow.AnimalName = "aCow";
        MyCow.ID = 1234;

        CowClass SecondCow = new CowClass();
        SecondCow.AnimalName = "Cow2";
        SecondCow.ID = 1235;

        ChickenClass MyChicken = new ChickenClass();
        MyChicken.AnimalName = "Tweety";

        MyCow.Milk();
        MyChicken.Fly();

        ArrayList<OldMcDonaldAnimal> MyAnimalList = new ArrayList<>();

        MyAnimalList.add(MyCow);
        MyAnimalList.add(SecondCow);
        MyAnimalList.add(MyChicken);

        for (int i = 0; i < MyAnimalList.size(); i++) {
            OldMcDonaldAnimal AnAnimal = MyAnimalList.get(i);
            AnAnimal.PrintNameAndLeg();
            AnAnimal.Eat();
        }

    }
}
